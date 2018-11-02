package com.jk.model;

import java.io.Serializable;
import java.util.Date;

public class Blog   implements Serializable {

    private static final long serialVersionUID = 5161735391961858026L;
    private   Integer     blog_id;
    private   String      blog_title;
    private   String      blog_content;
    private   Date        blog_Publication_time;
    private   Integer     blog_user_id;
    private   Integer     blog_Browse_number_id;

    public Integer getBlog_id() {
        return blog_id;
    }

    public void setBlog_id(Integer blog_id) {
        this.blog_id = blog_id;
    }

    public String getBlog_title() {
        return blog_title;
    }

    public void setBlog_title(String blog_title) {
        this.blog_title = blog_title;
    }

    public String getBlog_content() {
        return blog_content;
    }

    public void setBlog_content(String blog_content) {
        this.blog_content = blog_content;
    }

    public Date getBlog_Publication_time() {
        return blog_Publication_time;
    }

    public void setBlog_Publication_time(Date blog_Publication_time) {
        this.blog_Publication_time = blog_Publication_time;
    }

    public Integer getBlog_user_id() {
        return blog_user_id;
    }

    public void setBlog_user_id(Integer blog_user_id) {
        this.blog_user_id = blog_user_id;
    }

    public Integer getBlog_Browse_number_id() {
        return blog_Browse_number_id;
    }

    public void setBlog_Browse_number_id(Integer blog_Browse_number_id) {
        this.blog_Browse_number_id = blog_Browse_number_id;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "blog_id=" + blog_id +
                ", blog_title='" + blog_title + '\'' +
                ", blog_content='" + blog_content + '\'' +
                ", blog_Publication_time=" + blog_Publication_time +
                ", blog_user_id=" + blog_user_id +
                ", blog_Browse_number_id=" + blog_Browse_number_id +
                '}';
    }
}
