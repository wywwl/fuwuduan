package com.jk.model;

public class Type {

    private  Integer  id;
    private  String   tname;
    private  Integer  pid;

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

    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", tname='" + tname + '\'' +
                ", pid=" + pid +
                '}';
    }

}
