package com.jk.service.admin;

import com.jk.model.admin.*;

import java.util.List;
import java.util.Map;

public interface AdminService {

    /**
     * 登录判断用户是否存在
     * 吴洋洋
     * @param login
     * @return
     */
    Admins getUserByName(String login);


    /**
     * 左侧递归树
     * 吴洋洋
     * @return
     */
    List<Trees> getTree(Integer aid);

    /**
     * 用户列表
     * 吴洋洋
     * @return
     */
    Map<String, Object> getAdminAll(int page,int rows);


    /**
     * 用户所拥有的获取角色id
     * @return
     */
    List<AdminRoles> getRoleId(String adminId);

    /**
     * 角色列表
     * @return
     */
    List<Roles> getRole();

    /**
     * 用户添加角色方法
     * 吴洋洋
     * @param ids
     * @param adminId
     */
    void addAdminRole(String ids, String adminId);


    /**
     * 复选框树
     * 吴洋洋
     */
    List<Trees> getbokTree(String roleId);

    /**
     * 新增角色权限
     * 吴洋洋
     */
    void addRtree(String rolesId, String ids);


    /**
     * 新增管理员
     */
    void addAdminForm(String name,String login,String upwd,Integer age,Integer sex,String times,String emial);


    /**
     * 删除管理员用户
     * @return
     */
    void deleteAdmin(String ids);


    /**
     *过期广告位删除
     * @param id
     */
    void deleteAdvertisement(Integer id);

    /**
     * 日志
     * @param page
     * @param rows
     * @return
     */
    Map<String, Object> getLog(int page, int rows);





    /**
     *新增积分
     * @param
     * @param
     * @return
     */
    void addjif(Integer nbcount);


}
