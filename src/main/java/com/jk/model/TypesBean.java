package com.jk.model;

import java.io.Serializable;
import java.util.List;

public class TypesBean implements Serializable {

    private static final long serialVersionUID = -6856952853405097011L;

    private Integer id;
    private String tname;
    private Integer pid;
    private List<TypesBean> managesList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public List<TypesBean> getManagesList() {
        return managesList;
    }

    public void setManagesList(List<TypesBean> managesList) {
        this.managesList = managesList;
    }
}
