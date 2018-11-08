package com.jk.mapper;

import com.jk.model.*;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;
import java.util.List;

public interface CodeMapper {

    /*
     *   代码模块 发布代码
     * */
    @Insert("insert into  t_code (code_title,code_content,code_nb,code_type_id,code_user_id)  values (#{1},#{0})")
    void addCode(@Param("code") Code code);


    @Update("")
    void updateCode(Code code);
    /*
     * 代码后台  删除
     * */
    @Delete("delete  from t_code where code_id=#{code.code_id}")
    void deleteCode(@Param("code") Code code);

    /*
     * 代码后台  查询  分页
     * */
    @Select("select t1.code_id as code_id,t1.code_title as code_title," +
            "t1.code_content as code_content, t1.code_nb as code_nb," +
            " t1.code_Release_date as code_Release_date,t1.comment as comment," +
            "t1.code_Download as code_Download, t1.code_Browse as code_Browse," +
            "t3.file as userFile,t3.name as userName,t4.tname as tName,t1.start as start," +
            "t3.grade as grade," +
            "GROUP_CONCAT(t2.keyword_name SEPARATOR ',') keyword_name" +
            " from t_code t1 ,Keyword_intermediate_table t2,t_user t3,t_type t4" +
            "  where t1.code_id=t2.dome_id and t1.code_user_id=t3.id and t1.code_type_id=t4.id  and t1.start=1 " +
            " GROUP BY  t1.code_Id  limit #{start},#{pageSize}")
    List <Code> selectid(@Param("pageSize") int pageSize,@Param("start") int start);

    /*
     * 代码后台  查询条数
     * */
     @Select("select count(*) from  t_code")
     long emcount();
    /*
     * 代码后台  修改状态未审核通过
     * */
    @Update("update  t_code  set start=1 where code_id=#{code.code_id}")
    void updateall(@Param("code") Code code);

    /*
     * 代码后台  修改状态未审核未通过
     * */
    @Update("update  t_code  set start=3 where code_id=#{code.code_id}")
    void theshelves(@Param("code") Code code);


    /*
     *   博客模块  后台管理系统
     * */
    @Select("select t1.blog_id as blog_id,t1.blog_title as blog_title," +
            "t1.blog_content as blog_content,t1.blog_Publication_time as  blog_Publication_time," +
            "t1.blog_Browse_number as blog_Browse_number,t1.blog_comments as blog_comments," +
            "t2.file as userFile,t2.name as userName,t2.grade as grade" +
            " from  t_blog t1,t_user t2 where t1.blog_user_id=t2.id limit #{start},#{pageSize}")
    List<Blog> queryBlog(@Param("pageSize") Integer pageSize, @Param("start") Integer start);
    /*
     * 博客后台查询条数
     * */
    @Select("select count(*) from  t_blog")
    long queryBlogcount();

    /*
     * 博客后台删除
     * */
    @Delete("delete  from t_blog where blog_id=#{blog.blog_id}")
    void deleteBlog(@Param("blog") Blog blog);

    /*
     * 代码前台  查询后台跳转前台页面
     * */

    @Select("select t1.code_id as code_id,t1.code_title as code_title," +
            "t1.code_content as code_content, t1.code_nb as code_nb," +
                    " t1.code_Release_date as code_Release_date,t1.comment as comment," +
                    "t1.code_Download as code_Download, t1.code_Browse as code_Browse," +
                    "t3.file as userFile,t3.name as userName,t4.tname as tName,t1.start as start," +
                    "t3.grade as grade," +
                    "GROUP_CONCAT(t2.keyword_name SEPARATOR ',') keyword_name" +
                    " from t_code t1 ,Keyword_intermediate_table t2,t_user t3,t_type t4" +
                    "  where t1.code_id=t2.dome_id and t1.code_user_id=t3.id and t1.code_type_id=t4.id  and t1.start=1 " +
                    " GROUP BY  t1.code_Id  ")
     List<Code> qyerycode(@Param("code") Code code);

    /*
     * 博客前台  查询后台跳转前台页面
     * */

    @Select("select t1.blog_id as blog_id,t1.blog_title as blog_title," +
            " t1.blog_content as blog_content,t1.blog_Publication_time as  blog_Publication_time," +
            " t1.blog_Browse_number as blog_Browse_number,t1.blog_comments as blog_comments," +
            " t2.file as userFile,t2.name as userName,t2.grade as grade from  t_blog t1," +
            "t_user t2 where t1.blog_user_id=t2.id ")
    List<Blog> qyeryblog(@Param("blog") Blog blog);


    /*
     * 代码前台  根据Id查询数据
     * */
     @Select("select t1.code_id as code_id,t1.code_title as code_title," +
             " t1.code_content as code_content, t1.code_nb as code_nb," +
             " t1.code_Release_date as code_Release_date,t1.comment as comment," +
             " t1.code_Download as code_Download, t1.code_Browse as code_Browse," +
             " t3.file as userFile,t3.name as userName,t4.tname as tName," +
             "t1.start as start, t3.grade as grade," +
             " GROUP_CONCAT(t2.keyword_name SEPARATOR ',') keyword_name " +
             "from t_code t1 ,Keyword_intermediate_table t2," +
             "t_user t3,t_type t4 where t1.code_id=t2.dome_id and " +
             "t1.code_user_id=t3.id and t1.code_type_id=t4.id  and " +
             "t1.start=1 and t1.code_id=#{code.code_id} GROUP BY  t1.code_Id  ")
    List<Code> qyerycodejsp(@Param("code") Code code);
     /*
     * 博客前台  根据Id查询数据
     * */

     @Select("select t1.blog_id as blog_id,t1.blog_title as blog_title," +
             " t1.blog_content as blog_content," +
             "t1.blog_Publication_time as  blog_Publication_time," +
             " t1.blog_Browse_number as blog_Browse_number," +
             "t1.blog_comments as blog_comments, t2.file as userFile," +
             "t2.name as userName,t2.grade as grade " +
             "from  t_blog t1,t_user t2 where t1.blog_user_id=t2.id and t1.blog_id=#{blog.blog_id}")
    List<Blog> qyeryblogjsp(@Param("blog") Blog blog);


     @Select("select * from  t_user t1 ORDER BY  t1.nbcount DESC ")
     List<UserBean> qyeryznuser(UserBean userBean);

     @Select("select * from t_type z where z.pid=#{0}")
    List<TypesBean> selectManage(int i);


     @Select("select * from t_user")
    List<UserBean> qyeryuserinfo(UserBean userBean);

     @Update("update  t_code  set code_Browse=code_Browse+1  where code_id=#{code.code_id}")
     void updateBrowse(@Param("code") Code code);


     @Select("select * from t_user")
    List<UserBean> qyeryusercode(UserBean userBean);
        /*
        *   根据id查找 用户发表的所有作品
        * */

     @Select("select t1.code_id as code_id,t1.code_title as code_title," +
             " t1.code_content as code_content, t1.code_nb as code_nb, " +
             "t1.code_Release_date as code_Release_date,t1.comment as comment," +
             " t1.code_Download as code_Download, t1.code_Browse as code_Browse," +
             " t3.file as userFile,t3.name as userName,t4.tname as tName," +
             " t1.start as start, t3.grade as grade," +
             " GROUP_CONCAT(t2.keyword_name SEPARATOR ',') keyword_name " +
             "from t_code t1 , Keyword_intermediate_table t2," +
             " t_user t3, t_type t4" +
             " where t1.code_id=t2.dome_id and t1.code_user_id=t3.id " +
             "and t1.code_type_id=t4.id  and t1.start=1 " +
             "and t3.id=#{userBean.id} GROUP BY  t1.code_Id")
    List<Code> queryuser(@Param("userBean") UserBean userBean);
      /*
      *    点击用户名查找 该用户所有作品
      * */

     @Select("select t1.blog_id as blog_id,t1.blog_title as blog_title," +
             " t1.blog_content as blog_content," +
             " t1.blog_Publication_time as  blog_Publication_time," +
             " t1.blog_Browse_number as blog_Browse_number," +
             " t1.blog_comments as blog_comments, t2.file as userFile," +
             " t2.name as userName,t2.grade as grade" +
             " from  t_blog t1,t_user t2" +
             " where t1.blog_user_id=t2.id and t2.id=#{userBean.id}")
    List<Blog> querybloguser(@Param("userBean") UserBean userBean);

     @Select("select *  from  t_user where id=#{userBean.id}")
    List<UserBean> userinfo(@Param("userBean") UserBean userBean);


     @Select("select count(*) from t_code t1,t_user t2 " +
             "where t1.code_user_id = t2.id and t2.id=#{userBean.id}")
    Integer querycodecount(@Param("userBean") UserBean userBean);


    @Select("select count(*) from t_blog  t1,t_user t2 " +
            "where t1.blog_user_id = t2.id and t2.id=#{userBean.id}")
    Integer queryblogcount(@Param("userBean") UserBean userBean);


     @Select("select count(*) from  t_user_problem t1,t_probem t2, t_user t3 where t1.problemid=t2.id and t1.userid=t3.id and t3.id=#{userBean.id}")
    Integer problemcount(@Param("userBean") UserBean userBean);

     @Select("select t1.praiseCount as praiseCount,t1.likenumber as likenumber," +
             "t1.content as content,t1.commentCount as commentCount," +
             "t2.name as userName,t2.grade as grade,t1.addtime as addtime" +
             "  from  t_comment t1,t_user t2  where t1.uid=t2.id   " +
             "ORDER BY  t1.addtime DESC")
    List<Comment> querycommnet(@Param("comment") Comment comment);

     @Update("update t_user set  gradeFile=#{gradeFile}  where id" )
        void updatefile(@Param("gradeFile") String  gradeFile);

     @Select("select *  from t_user  where id=#{userBean.id}")
     UserBean querygrade(@Param("userBean") UserBean userBean);

     @Insert("insert into t_blog  values(#{blog.blog_id},#{blog.blog_title},#{blog.blog_content},SYSDATE(),1,0,0)")
     void addblog(@Param("blog") Blog blog);
}




