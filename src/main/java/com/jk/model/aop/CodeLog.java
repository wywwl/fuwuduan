package com.jk.model.aop;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 王玉荣
 */
@Document(collection="CodeLog")
public class CodeLog {

    private String id;
    private String userId;
    private     Integer   code_id;
    private    String    code_title;
    private    String    code_content;
    private    Integer   code_nb;
    private    String    code_type_id ;
    private    Integer    code_user_id;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date code_Release_date;
    private    Integer   code_Download;  //下载数
    private    Integer    code_Browse;   //浏览数
    private    String     comment;
    private    Integer    start;

    private    String  keyword_name;
    private    String  userFile;
    private    String  userName;
    private    String  tName;
    private    String  grade;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date startTime;

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCode_id() {
        return code_id;
    }

    public void setCode_id(Integer code_id) {
        this.code_id = code_id;
    }

    public String getCode_title() {
        return code_title;
    }

    public void setCode_title(String code_title) {
        this.code_title = code_title;
    }

    public String getCode_content() {
        return code_content;
    }

    public void setCode_content(String code_content) {
        this.code_content = code_content;
    }

    public Integer getCode_nb() {
        return code_nb;
    }

    public void setCode_nb(Integer code_nb) {
        this.code_nb = code_nb;
    }

    public String getCode_type_id() {
        return code_type_id;
    }

    public void setCode_type_id(String code_type_id) {
        this.code_type_id = code_type_id;
    }

    public Integer getCode_user_id() {
        return code_user_id;
    }

    public void setCode_user_id(Integer code_user_id) {
        this.code_user_id = code_user_id;
    }

    public Date getCode_Release_date() {
        return code_Release_date;
    }

    public void setCode_Release_date(Date code_Release_date) {
        this.code_Release_date = code_Release_date;
    }

    public Integer getCode_Download() {
        return code_Download;
    }

    public void setCode_Download(Integer code_Download) {
        this.code_Download = code_Download;
    }

    public Integer getCode_Browse() {
        return code_Browse;
    }

    public void setCode_Browse(Integer code_Browse) {
        this.code_Browse = code_Browse;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public String getKeyword_name() {
        return keyword_name;
    }

    public void setKeyword_name(String keyword_name) {
        this.keyword_name = keyword_name;
    }

    public String getUserFile() {
        return userFile;
    }

    public void setUserFile(String userFile) {
        this.userFile = userFile;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
