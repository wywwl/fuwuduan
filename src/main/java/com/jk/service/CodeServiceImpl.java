package com.jk.service;


import com.alibaba.fastjson.JSON;
import com.jk.mapper.CodeMapper;
import com.jk.model.*;
import com.jk.utils.OSSClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

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
    public List<Code> queryMasterCode() {


        return codeMapper.queryMasterCode();
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

    @Override
    public List<Code> qyerycode(Code code,String keyword_name,String tname,String ids) {
        return codeMapper.qyerycode(code,keyword_name,tname,ids);
    }

    @Override
    public List<Blog> qyeryblog(Blog blog) {

        return codeMapper.qyeryblog(blog);
    }

    @Override
    public List<Code> qyerycodejsp(Code code) {
        List<Code> list=  codeMapper.qyerycodejsp(code);
        codeMapper.updateBrowse(code);
         return list;
    }

    @Override
    public List<Blog> qyeryblogjsp(Blog blog) {
        return codeMapper.qyeryblogjsp(blog);
    }

    @Override
    public List<UserBean> qyeryznuser(UserBean userBean) {
        return codeMapper.qyeryznuser(userBean);
    }

    @Override
    public String selectManage() {
        List<TypesBean> list = codeMapper.selectManage(0);
        for (TypesBean area : list) {
            Integer id = area.getId();
            List<TypesBean> getchild = codeMapper.selectManage(id);
            area.setManagesList(getchild);
        }
        return JSON.toJSONString(list);
    }

    @Override
    public List<UserBean> qyeryuserinfo(UserBean userBean) {


        return codeMapper.qyeryuserinfo(userBean);
    }

    @Override
    public List<UserBean> qyeryusercode(UserBean userBean) {


        return codeMapper.qyeryusercode(userBean);
    }



    @Override
    public List<Code> queryuser(UserBean userBean) {

        return codeMapper.queryuser(userBean);
    }

    @Override
    public List<Blog> querybloguser(UserBean userBean) {
        return codeMapper.querybloguser(userBean);
    }

    @Override
    public List<UserBean> userinfo(UserBean userBean) {

        return codeMapper.userinfo(userBean);
    }

    @Override
    public Integer querycodecount(UserBean userBean) {

        return codeMapper.querycodecount(userBean);
    }

    @Override
    public Integer queryblogcount(UserBean userBean) {
        return codeMapper.queryblogcount(userBean);
    }

    @Override
    public Integer problemcount(UserBean userBean) {
        return codeMapper.problemcount(userBean);
    }

    @Override
    public List<Comment> querycommnet(Comment comment) {

        return codeMapper.querycommnet(comment);
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
        Integer blog_id = blog.getBlog_id();
        Integer integer = Integer.getInteger(String.valueOf(blog_id));
        blog.setBlog_id(integer);
        System.out.println(integer);
        codeMapper.deleteBlog(blog);
    }


    @RequestMapping("addblog")
    @ResponseBody
    public String addblog(Blog blog){

        codeMapper.addblog(blog);
        return "{}";
    }










}
