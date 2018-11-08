package com.jk.model;
import java.io.Serializable;
import java.util.Date;

/**
 * util
 *
 */
public class Problem implements Serializable  {
    private  Integer id;

    private String content;//问题内容

    private  String createtime;//发表时间

    private  String problem;//问题

   private  Integer browse;//浏览次数

   private String tname;//名称

   private Integer jifen;//积分

   private String grade;//登级

   private Integer nbcount;//牛币

    private String craetDate;//问题发表时间

    private Date newDate;

    public Date getNewDate() {
        return newDate;
    }

    public void setNewDate(Date newDate) {
        this.newDate = newDate;
    }

    public String getCraetDate() {
        return craetDate;
    }

    public void setCraetDate(String craetDate) {
        this.craetDate = craetDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public Integer getBrowse() {
        return browse;
    }

    public void setBrowse(Integer browse) {
        this.browse = browse;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Integer getJifen() {
        return jifen;
    }

    public void setJifen(Integer jifen) {
        this.jifen = jifen;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Integer getNbcount() {
        return nbcount;
    }

    public void setNbcount(Integer nbcount) {
        this.nbcount = nbcount;
    }

    @Override
    public String toString() {
        return "Problem{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", createtime='" + createtime + '\'' +
                ", problem='" + problem + '\'' +
                ", browse=" + browse +
                ", tname='" + tname + '\'' +
                ", jifen=" + jifen +
                ", grade='" + grade + '\'' +
                ", nbcount=" + nbcount +
                ", craetDate='" + craetDate + '\'' +
                '}';
    }
    //
    public Problem() {
        super();
    }
}
