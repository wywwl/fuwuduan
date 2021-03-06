package com.jk.mapper.admin;

import com.jk.model.admin.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface AdminMapper {

    Admins getUserByName(String login);


    List<Trees> getNode(@Param("admin") Integer aid,@Param("pid") Integer pid);

    long getAdminCount();

    List<Admins> getAdminAll(@Param("start") int start, @Param("rows")int rows);

    List<AdminRoles> getRoleId(String adminId);

    List<Roles> getRole();

    void deleteAdminRole(String adminId);

    void addAdminRole(ArrayList<AdminRoles> arrayList);

    List<RoleTrees> getTreeRole(String roleId);

    List<Trees> getbokNode(Integer pid);

    void deleteRtree(String rolesId);

    void addRtree(ArrayList<RoleTrees> arrayList);

    void addAdminForm(@Param("name") String name,@Param("login")String login,@Param("upwd")String upwd,@Param("age")Integer age,@Param("sex")Integer sex,@Param("times")String times,@Param("emial")String emial);

    void deleteAdmin(String[] split);
    

    void deleteAdvertisement(Integer id);
    void addjif(@Param("nbcount") Integer nbcount);

}
