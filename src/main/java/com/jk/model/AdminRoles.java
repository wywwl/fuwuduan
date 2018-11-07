package com.jk.model;
/**
 *后台管理用户 角色中间表
 * 吴洋洋
 */
public class AdminRoles {

    private Integer arid;

    private Integer adminId;

    private Integer roleId;

    public Integer getArid() {
        return arid;
    }

    public void setArid(Integer arid) {
        this.arid = arid;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
