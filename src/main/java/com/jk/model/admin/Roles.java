package com.jk.model.admin;

import java.io.Serializable;

/**
 *后台管理角色表
 * 吴洋洋
 */
public class Roles implements Serializable {

    private static final long serialVersionUID = 6611596530713656451L;

    private Integer rid;

    private String rname;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }
}
