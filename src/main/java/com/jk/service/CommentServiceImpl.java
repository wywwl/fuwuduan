package com.jk.service;

import com.jk.mapper.CommentMapper;
import com.jk.model.Admins;
import com.jk.model.Blog;
import com.jk.model.Comment;
import com.jk.util.ResultPage;
import com.jk.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Service

public class CommentServiceImpl implements  CommentService {

    @Autowired
    private CommentMapper commentMepper;


    @Override
    public List<Comment> queryComment(String bid) {
        String pid="0";
        List<Comment>list=commentMepper.queryComment(bid,pid);
        for (Comment comment :list){
            List<Comment> children = commentMepper.queryComment(bid,comment.getId());
            comment.setChildren(children);
        }

        return list ;
    }

    @Override
    public void saveComment(Comment comment) {
        commentMepper.saveComment(comment);
    }

    @Override
    public ResultPage queryAdminComment(Comment comment) {
        ResultPage result = new ResultPage();
        comment.calculate();
        int count=commentMepper.getcount(comment);

        result.setTotal(count);
        List<Comment> list = commentMepper.queryAdminComment(comment);
        result.setRows(list);

        return result;
    }

    @Override
    public void addPraise(Integer id) {
        commentMepper.addPraise(id);
    }

    @Override
    public void dels(String ids) {
        String[] arr = ids.split(",");
        List<String> list = new ArrayList<String>();
        for(int i = 0;i<arr.length;i++) {
            list.add(arr[i]);
        }
        commentMepper.dels(list);

    }

    @Override
    public void del(String id) {
        commentMepper.del(id);
    }

    @Override
    public void addContent(/*HttpServletRequest request,*/Comment comment,Admins admin) {
       /* HttpSession session = request.getSession();
        Admins a = (Admins) session.getAttribute(String.valueOf(admin.getAid()));*/
       comment.setId( StringUtil.getUUID());
        admin.setAid(1);
        commentMepper.addContent(comment,admin.getAid());
    }

    @Override
    public List<Blog> getBlogData(Blog blog) {

        return commentMepper.getBlogData(blog);
    }

    public List<Comment> getCommentByPage(Comment comment) {
        return commentMepper.getCommentByPage(comment);
    }


}
