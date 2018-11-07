package com.jk.model;

import java.io.Serializable;

/**
 * 王玉荣
 */
public class UserBean implements Serializable {

    private static final long serialVersionUID = 3671916659679712556L;
    private Integer id;

    private String name;

    private  Integer sex;

    private Integer age;

    private String login;

    private String upwds;

    private String address;

    private String uemial;

    private String qianming;
    private String file;

    //创建时间
    private String createtime;

    //最后登陆时间
    private String lastlogintime;

    //注册ip
    private String zhuceip;

    //登陆ip
    private String loginip;

    //标识
    private String flag;

    //积分
    private Integer jifen;

    //用户组名称
    private String groupname;
    //用户组id
    private Integer groupid;


    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getQianming() {
        return qianming;
    }

    public void setQianming(String qianming) {
        this.qianming = qianming;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(String lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public String getZhuceip() {
        return zhuceip;
    }

    public void setZhuceip(String zhuceip) {
        this.zhuceip = zhuceip;
    }

    public String getLoginip() {
        return loginip;
    }

    public void setLoginip(String loginip) {
        this.loginip = loginip;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Integer getJifen() {
        return jifen;
    }

    public void setJifen(Integer jifen) {
        this.jifen = jifen;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getUpwds() {
        return upwds;
    }

    public void setUpwds(String upwds) {
        this.upwds = upwds;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUemial() {
        return uemial;
    }

    public void setUemial(String uemial) {
        this.uemial = uemial;
    }
}
