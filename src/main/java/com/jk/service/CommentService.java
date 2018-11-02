package com.jk.service;

import com.jk.model.Admins;
import com.jk.model.Blog;
import com.jk.model.Comment;
import com.jk.util.ResultPage;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface CommentService {


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
}
