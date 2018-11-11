package com.jk.service;

import com.jk.model.*;
import com.jk.util.ResultPage;

import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface CommentService   {


    /**
     * 查询评论
     */
    public List<Comment> queryComment(String bid );

    /**
     * 发送评论
     */

    public void saveComment(Comment comment);

    /**
     * 后台条查
     * @param comment
     * @return
     */
     ResultPage queryAdminComment(Comment comment);




    /**
     *dian  zan
     * @param id
     */
    public  void addPraise(Integer id);


    /**
     * 批量删除 评论信息
     * @param ids
     */
    void dels(String ids);

    /**
     * 删除单条
     * @param id
     */
    void del(String id);

    /**
     * 后台新增评论
     */
    void addContent(/*HttpServletRequest request,*/ Comment comment, Admins admins);

    /**
     * 查询博客的信息
     */
    List<Blog> getBlogData(Blog blog);


    //用户注册
    void insert(UserBean user);

    UserBean findbyid(UserBean user);

    Boolean updategroupbyuser(Integer id, int groupvip);

    Object isusername(String login);

    void updateuseronlinetime(UserBean user);

    void insertss(Jifen jifen);

    int findnowcount(Jifen jifen);

    Map<String, Object> login(UserBean user);

  //修改密码
    void update(UserBean user);
   //登录 用户id
   UserBean findbyuserid(Integer id);
    List<UserBean> findUserInfo(UserBean users);
    Integer getCount();

    //心情展示
    List<Mood> getMoodList(Mood mood);

    //统计每周的注册人数
    List<Map<String,Object>> findGroupWeekData();


    //发表评论
    void saveMood(Mood  mood);


    //查询积分
    PageBean<Jifen> findpage(Jifen jifen, PageBean<Jifen> page);
}
