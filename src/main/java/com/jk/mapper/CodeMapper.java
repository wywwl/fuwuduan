package com.jk.mapper;

import com.jk.model.Blog;
import com.jk.model.Code;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface CodeMapper {

    /*
     *   代码模块 后台管理系统
     * */
    @Insert("insert into  t_code (code_title,code_content,code_nb,code_type_id,code_user_id)  values (#{1},#{0})")
    void addCode(@Param("code") Code code);


    @Update("")
    void updateCode(Code code);

    @Delete("delete  from t_code where code_id=#{code.code_id}")
    void deleteCode(@Param("code") Code code);

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

     @Select("select count(*) from  t_code")
     long emcount();

    @Update("update  t_code  set start=1 where code_id=#{code.code_id}")
    void updateall(@Param("code") Code code);

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

    @Select("select count(*) from  t_blog")
    long queryBlogcount();

    @Delete("delete  from t_blog where blog_id=#{blog.blog_id}")
    void deleteBlog(@Param("blog") Blog blog);



}
