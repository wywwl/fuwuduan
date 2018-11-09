package com.jk.model;


import com.jk.utils.Page;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Comment  extends Page implements Serializable {


    private static final long serialVersionUID = -5033487196213375146L;

    private int pCommentId;//父级评论id // 为0 则是一级评论 不为0则是评论的回复


    private String beginDate;
    private String endDate;

    private int commentNumber;//回复数

    private int praiseCount;//点赞数

   private Integer uid; //用户id

    private String id;


    private String email;

    private String content;

    private String courseid;
    private String addtime;

    private String pid;

    private Integer likenumber;
    private  Integer commentCount;

    private String bid;

      private Integer aid;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getpCommentId() {
        return pCommentId;
    }

    public void setpCommentId(int pCommentId) {
        this.pCommentId = pCommentId;
    }

    private List<Comment> children;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public int getCommentNumber() {
        return commentNumber;
    }

    public void setCommentNumber(int commentNumber) {
        this.commentNumber = commentNumber;
    }

    public int getPraiseCount() {
        return praiseCount;
    }

    public void setPraiseCount(int praiseCount) {
        this.praiseCount = praiseCount;
    }

    public List<Comment> getChildren() {
        return children;
    }

    public void setChildren(List<Comment> children) {
        this.children = children;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid == null ? null : courseid.trim();
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public Integer getLikenumber() {
        return likenumber;
    }

    public void setLikenumber(Integer likenumber) {
        this.likenumber = likenumber;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "pCommentId=" + pCommentId +
                ", beginDate='" + beginDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", commentNumber=" + commentNumber +
                ", praiseCount=" + praiseCount +
                ", uid=" + uid +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", content='" + content + '\'' +
                ", courseid='" + courseid + '\'' +
                ", addtime='" + addtime + '\'' +
                ", pid='" + pid + '\'' +
                ", likenumber=" + likenumber +
                ", commentCount=" + commentCount +
                ", bid='" + bid + '\'' +
                ", aid=" + aid +
                ", children=" + children +
                '}';
    }
}