package com.jk.model;

public class MoodWithBLOBs extends Mood {
    //帖子的文本内容（用于做摘要使用）
    private String contenthtml;

    private String contenttxt;

    public String getContenthtml() {
        return contenthtml;
    }

    public void setContenthtml(String contenthtml) {
        this.contenthtml = contenthtml == null ? null : contenthtml.trim();
    }

    public String getContenttxt() {
        return contenttxt;
    }

    public void setContenttxt(String contenttxt) {
        this.contenttxt = contenttxt == null ? null : contenttxt.trim();
    }
}