package com.jk.model.admin;

import java.io.Serializable;

/**
 *角色权限树中间关联表
 * 吴洋洋
 */
public class RoleTrees implements Serializable {

    private static final long serialVersionUID = -8261605094076668231L;

    private Integer trid;

    private Integer roleId;

    private Integer treeId;


    public Integer getTrid() {
        return trid;
    }

    public void setTrid(Integer trid) {
        this.trid = trid;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getTreeId() {
        return treeId;
    }

    public void setTreeId(Integer treeId) {
        this.treeId = treeId;
    }
}
