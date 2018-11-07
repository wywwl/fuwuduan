package com.jk.mapper;

import com.jk.model.*;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CommentMapper   {


     void saveComment(Comment comment) ;


    int deleteByPrimaryKey(String id);



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

    List<UserBean> find(UserBean user);

    void insert(UserBean user);

    void insertgroupUser(GroupUser groupUser);

    void delgroupbyuser(Integer id);

    void updateuseronlinetime(UserBean user);

    int findnowcount(Jifen jifen);

    void updatejifen(Integer userid);

    void insertss(Jifen jifen);
  //修改密码
    void update(UserBean user);

    UserBean findInfoById(Integer id);
}