package com.jk.model;

import java.io.Serializable;

public class Mood implements Serializable {

    private static final long serialVersionUID = -8413715996972333671L;
    private Integer id;

    //心情标题
    private String name;

    //创建时间
    private String createtime;

    //创建人
    private Integer createuserid;

    //板块id
    private Integer bankuaiId;

    //帖子的html内容
    private String contenthtml;

    //主题的id
    private String zhutiid;
    //最后编辑内容记录
    private String lastupdate;
    //是否为精华 1，2，3
    private String jinghua;
    //是否为置顶 1板块置顶 2是全局置顶
    private String zhiding;
    //查看次数
    private String findcount;
    //最后回复的id
    private String huifuid;

    //主题名称
    private String zhutiname;

    //板块名称
    private String bankuainame;
    //最后回复用户id
    private String huifuuserid;
    //最后回复用户名称
    private String huifuusername;
    //最后回复时间
    private String huifucreatetime;
    //回复总数
    private String huifucount;
    //帖子的userid
    private String tieziuserid;
    //帖子的用户名称
    private String tieziusername;
    //帖子的用户图片
    private String tieziuserimg;
    //排序
    private String orderby;


    private int praiseCount;//点赞数

    private int  stepCount;  //踩次数

    public int getPraiseCount() {
        return praiseCount;
    }

    public void setPraiseCount(int praiseCount) {
        this.praiseCount = praiseCount;
    }

    public int getStepCount() {
        return stepCount;
    }

    public void setStepCount(int stepCount) {
        this.stepCount = stepCount;
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

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public Integer getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(Integer createuserid) {
        this.createuserid = createuserid;
    }

    public Integer getBankuaiId() {
        return bankuaiId;
    }

    public void setBankuaiId(Integer bankuaiId) {
        this.bankuaiId = bankuaiId;
    }

    public String getContenthtml() {
        return contenthtml;
    }

    public void setContenthtml(String contenthtml) {
        this.contenthtml = contenthtml;
    }



    public String getZhutiid() {
        return zhutiid;
    }

    public void setZhutiid(String zhutiid) {
        this.zhutiid = zhutiid;
    }

    public String getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(String lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getJinghua() {
        return jinghua;
    }

    public void setJinghua(String jinghua) {
        this.jinghua = jinghua;
    }

    public String getZhiding() {
        return zhiding;
    }

    public void setZhiding(String zhiding) {
        this.zhiding = zhiding;
    }

    public String getFindcount() {
        return findcount;
    }

    public void setFindcount(String findcount) {
        this.findcount = findcount;
    }

    public String getHuifuid() {
        return huifuid;
    }

    public void setHuifuid(String huifuid) {
        this.huifuid = huifuid;
    }

    public String getZhutiname() {
        return zhutiname;
    }

    public void setZhutiname(String zhutiname) {
        this.zhutiname = zhutiname;
    }

    public String getBankuainame() {
        return bankuainame;
    }

    public void setBankuainame(String bankuainame) {
        this.bankuainame = bankuainame;
    }

    public String getHuifuuserid() {
        return huifuuserid;
    }

    public void setHuifuuserid(String huifuuserid) {
        this.huifuuserid = huifuuserid;
    }

    public String getHuifuusername() {
        return huifuusername;
    }

    public void setHuifuusername(String huifuusername) {
        this.huifuusername = huifuusername;
    }

    public String getHuifucreatetime() {
        return huifucreatetime;
    }

    public void setHuifucreatetime(String huifucreatetime) {
        this.huifucreatetime = huifucreatetime;
    }

    public String getHuifucount() {
        return huifucount;
    }

    public void setHuifucount(String huifucount) {
        this.huifucount = huifucount;
    }

    public String getTieziuserid() {
        return tieziuserid;
    }

    public void setTieziuserid(String tieziuserid) {
        this.tieziuserid = tieziuserid;
    }

    public String getTieziusername() {
        return tieziusername;
    }

    public void setTieziusername(String tieziusername) {
        this.tieziusername = tieziusername;
    }

    public String getTieziuserimg() {
        return tieziuserimg;
    }

    public void setTieziuserimg(String tieziuserimg) {
        this.tieziuserimg = tieziuserimg;
    }

    public String getOrderby() {
        return orderby;
    }

    public void setOrderby(String orderby) {
        this.orderby = orderby;
    }




}
