package com.jk.controller;


import com.jk.model.Blog;
import com.jk.model.Code;
import com.jk.service.CodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
@RequestMapping("CodeController")
public class CodeController {

    @Autowired
    private   CodeService  codeService;

    /**
     *  代码模块后台系统：查询 ,分页
     *
     */

    //查询
    @RequestMapping("queryCode")
    @ResponseBody
    public HashMap<String, Object> queryCode( Integer pageSize,Integer start){
        HashMap<String, Object> map=codeService.queryCode(pageSize,start);

        return map;

    }


    /**
     *  代码模块后台系统：新增,修改   暂时未完成
     *
     */
    @RequestMapping("addCode")
    @ResponseBody
    public  void addCode(Code  code){

        codeService.addCode(code);
    }

    /*
    *   代码模块后台系统：删除
    *
    * */
    @RequestMapping("deleteCode")
    @ResponseBody
    public  void deleteCode(Code  code){

        codeService.deleteCode(code);
    }


    /*
     *   代码模块后台系统：审核改变状态
     *
     * */
    @RequestMapping("updateall")
    @ResponseBody
    public  void updateall(Code  code){

        codeService.updateall(code);
    }


    /*
     *   代码模块后台系统：审核改变为未通过
     *
     * */
    @RequestMapping("theshelves")
    @ResponseBody
    public  void theshelves(Code  code){

        codeService.theshelves(code);
    }

    /*
     *   博客模块后台系统：查询
     *
     * */
    @RequestMapping("queryBlog")
    @ResponseBody
    public HashMap<String, Object> queryBlog( Integer pageSize,Integer start){
        HashMap<String, Object> map=codeService.queryBlog(pageSize,start);

        return map;
    }

    /*
     *   博客模块后台系统：：删除
     *
     * */
    @RequestMapping("deleteBlog")
    @ResponseBody
    public  void deleteBlog(Blog blog){

        codeService.deleteBlog(blog);
    }


}
