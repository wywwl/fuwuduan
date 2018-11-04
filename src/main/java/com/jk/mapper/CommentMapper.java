package com.jk.mapper;

import com.jk.model.Blog;
import com.jk.model.Comment;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CommentMapper {
     void saveComment(Comment comment) ;


    int deleteByPrimaryKey(String id);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);

    List<Comment> queryComment(@Param("bid") String bid, @Param("pid") String pid);

    void addPraise(Integer id);

    List<Comment> getCommentByPage(Comment comment);
 @Select(" SELECT COUNT(*) FROM T_COMMENT WHERE pCommentId= 0")
    int getcount(Comment comment);

    List<Comment> queryAdminComment(Comment comment);

    void del(String id);

    void dels(List<String> list);

    void addContent(@Param("comment") Comment comment,@Param("aid") Integer aid);

    List<Blog> getBlogData(Blog blog);
}