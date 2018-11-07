package com.jk.service;


import com.alibaba.fastjson.JSON;
import com.jk.mapper.CodeMapper;
import com.jk.model.Blog;
import com.jk.model.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class CodeServiceImpl implements  CodeService {

    @Autowired
    private CodeMapper codeMapper;
    /*
     *
     *
     * 代码模块  查询
     * */

    @Override
    public HashMap<String, Object> queryCode(Integer pageSize, Integer start) {
        List<Code> listem = codeMapper.selectid(pageSize, start);
        long count = codeMapper.emcount();
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("total", count);
        map.put("rows", listem);
        JSON.toJSONString(map);
        return map;

    }



    @Override
    public void addCode(Code code) {

          if(code == null ){
              codeMapper.addCode(code);
          }else {
              codeMapper.updateCode(code);

          }
    }

    @Override
    public void deleteCode(Code code) {

        codeMapper.deleteCode(code);
    }

    /*
    *   改变状态为审核通过
    *
    * */
    @Override
    public void updateall(Code code) {

        codeMapper.updateall(code);
    }
    /*
     *   改变状态为审核未通过
     *
     * */
    @Override
    public void theshelves(Code code) {
        codeMapper.theshelves(code);
    }

    /*
     *
     *
     * 博客模块  查询
     * */
    @Override
    public HashMap<String, Object> queryBlog(Integer pageSize, Integer start) {
        List<Blog> listem = codeMapper.queryBlog(pageSize, start);
        long count = codeMapper.queryBlogcount();
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("total", count);
        map.put("rows", listem);
        JSON.toJSONString(map);
        return map;
    }

    @Override
    public void deleteBlog(Blog blog) {
        codeMapper.deleteBlog(blog);
    }






}
