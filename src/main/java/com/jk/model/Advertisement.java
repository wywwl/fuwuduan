package com.jk.model;

import java.io.Serializable;

public class Advertisement implements Serializable {

    private static final long serialVersionUID = 3817476700677236456L;

    private Integer  id;
    private String  text;
    private String   img;
    private String   enterprise;
    private String  enterprisephone;
    private String  enterpriseemail;
    private String   starttime;
    private String   endtime;
    private long   secondtime;

    public long getSecondtime() {
        return secondtime;
    }

    public void setSecondtime(long secondtime) {
        this.secondtime = secondtime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }

    public String getEnterprisephone() {
        return enterprisephone;
    }

    public void setEnterprisephone(String enterprisephone) {
        this.enterprisephone = enterprisephone;
    }

    public String getEnterpriseemail() {
        return enterpriseemail;
    }

    public void setEnterpriseemail(String enterpriseemail) {
        this.enterpriseemail = enterpriseemail;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }
}
