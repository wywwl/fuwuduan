package com.jk.service.admin;

import com.jk.mapper.admin.AdminMapper;
import com.jk.model.admin.*;
import com.jk.model.aop.CodeLog;
import com.jk.model.aop.Logs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AdminServiceImpl implements AdminService {


    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    @Lazy
    private MongoTemplate mongoTemplate;

    @Override
    public Admins getUserByName(String login) {
        Admins userByName = adminMapper.getUserByName(login);
        return userByName;
    }

    /**
     * 左侧权限树
     * 吴洋洋
     *
     * @return
     */
    @Override
    public List<Trees> getTree(Integer aid) {
        Integer pid = 0;
        List<Trees> node = getNode(aid,pid);
        return node;
    }

    private List<Trees> getNode(Integer aid,Integer pid) {
        List<Trees> tree = adminMapper.getNode(aid,pid);
        for (Trees trees : tree) {
            List<Trees> node = getNode(aid,trees.getTid());
            if (node != null && node.size() > 0) {
                trees.setLeaf(false);
                trees.setSelectable(false);
                trees.setNodes(node);
            } else {
                trees.setLeaf(true);
                trees.setSelectable(true);
            }
        }
        return tree;
    }


    @Override
    public Map<String, Object> getAdminAll(int page, int rows) {
        Map<String, Object> map = new HashMap<>();

        long count = adminMapper.getAdminCount();
        int start = (page - 1) * rows;

        List<Admins> ulist = adminMapper.getAdminAll(start, rows);
        map.put("total", count);
        map.put("rows", ulist);
        return map;
    }


    @Override
    public List<AdminRoles> getRoleId(String adminId) {
        return adminMapper.getRoleId(adminId);
    }

    @Override
    public List<Roles> getRole() {
        List<Roles> role = adminMapper.getRole();
        return role;
    }

    @Override
    public void addAdminRole(String ids, String adminId) {

        adminMapper.deleteAdminRole(adminId);

        if (ids != "" && ids.length() > 0) {
            ArrayList<AdminRoles> arrayList = new ArrayList<AdminRoles>();
            String[] split = ids.split(",");
            for (int i = 0; i < split.length; i++) {
                AdminRoles adminRoles = new AdminRoles();
                adminRoles.setAdminId(Integer.parseInt(adminId));
                adminRoles.setRoleId(Integer.parseInt(split[i]));
                arrayList.add(adminRoles);
            }
            adminMapper.addAdminRole(arrayList);
        }

    }

    @Override
    public List<Trees> getbokTree(String roleId) {
        List<RoleTrees> roleTree = adminMapper.getTreeRole(roleId);
        Integer pid = 0;
        List<Trees> nodes = getbokNode(roleTree, pid);
        return nodes;
    }

    private List<Trees> getbokNode(List<RoleTrees> roleTree, Integer pid) {
        List<Trees> tree = adminMapper.getbokNode(pid);
        for (Trees trees : tree) {
            for (RoleTrees roleTrees : roleTree) {
                if (trees.getTid().equals(roleTrees.getTreeId())) {
                    trees.setChecked(true);
                    break;
                } else {
                    trees.setChecked(false);
                }
            }
            List<Trees> node = getbokNode(roleTree, trees.getTid());
            trees.setChildren(node);
        }
        return tree;
    }


    @Override
    public void addRtree(String rolesId, String ids) {
        adminMapper.deleteRtree(rolesId);

        if (ids != "" && ids.length() > 0) {
            ArrayList<RoleTrees> arrayList = new ArrayList<RoleTrees>();
            String[] split = ids.split(",");
            for (int i = 0; i < split.length; i++) {
                RoleTrees roleTrees = new RoleTrees();
                roleTrees.setRoleId(Integer.parseInt(rolesId));
                roleTrees.setTreeId(Integer.parseInt(split[i]));
                arrayList.add(roleTrees);
            }
            adminMapper.addRtree(arrayList);
        }


    }

    @Override
    public void addAdminForm(String name,String login,String upwd,Integer age,Integer sex,String times,String emial) {
        adminMapper.addAdminForm(name,login,upwd,age,sex,times,emial);
    }

    @Override
    public void deleteAdmin(String ids) {
        adminMapper.deleteAdmin(ids.split(","));
    }


    @Override
    public void deleteAdvertisement(Integer id) {
        adminMapper.deleteAdvertisement(id);
    }

    @Override
    public Map<String, Object> getLog(int page, int rows) {
        Map<String, Object> map = new HashMap<>();
        Query query = new Query();
        query.with(new Sort(new Order(Direction.DESC,"createTime")));
        long count =  mongoTemplate.count(query, Logs.class);
        map.put("total", count);
        query.skip((page-1)*rows);
        query.limit(rows);
        List<Logs> find = mongoTemplate.find(query, Logs.class);
        map.put("rows", find);
        return map;
    }


    @Override
    public void addjif(Integer nbcount) {
        adminMapper.addjif(nbcount);
    }


    @Override
    public List<CodeLog> getMongodbFootprint(Integer id) {
        Query query = new Query();
        query = Query.query(Criteria.where("userId").regex(".*?"+id+".*"));
        query.with(new Sort(new Order(Direction.DESC,"startTime")));
        List<CodeLog> find = mongoTemplate.find(query, CodeLog.class);
        return find;
    }


}