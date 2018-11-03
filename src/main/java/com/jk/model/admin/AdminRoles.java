package com.jk.model.admin;

import java.io.Serializable;

/**
 *后台管理用户 角色中间表
 * 吴洋洋
 */
public class AdminRoles implements Serializable {

    private static final long serialVersionUID = 2342374066133595223L;

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
