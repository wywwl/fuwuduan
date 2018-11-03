package com.jk.service;

import com.jk.model.Blog;
import com.jk.model.Code;

import java.util.HashMap;

public interface CodeService {


    void addCode(Code code);

    void deleteCode(Code code);
     /*
     *
       *
       * 代码模块  查询
     * */
    HashMap<String, Object> queryCode(Integer pageSize, Integer start);


    /*
     *
     *
     * 博客模块  查询
     * */
    HashMap<String, Object> queryBlog(Integer pageSize, Integer start);

    void deleteBlog(Blog blog);

    void updateall(Code code);

    void theshelves(Code code);
}
