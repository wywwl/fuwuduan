package com.jk.service;

import com.jk.mapper.CommentMapper;
import com.jk.model.*;
import com.jk.util.PublicStatic;
import com.jk.util.ResultPage;
import com.jk.util.StringUtil;
import com.jk.util.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service

public class CommentServiceImpl   implements  CommentService {

    @Autowired
    private CommentMapper commentMepper;

    @Override
    public List<Mood> getMoodList(Mood mood) {
      List<Mood> moods=  commentMepper.getMoodList(mood);
        return  moods;
    }

    @Override
    public List<Map<String,Object>> findGroupWeekData() {

       return  commentMepper.getGroupWeekData();
    }

    @Override
    public void saveMood(Mood mood) {

        commentMepper.saveMood(mood);

    }


    @Override
    public PageBean<Jifen> findpage(Jifen jifen, PageBean<Jifen> page) {
        page.setBean(jifen);
       int count= commentMepper.findpagecount(page);
        page.setTotalRecords(count);
        List<Jifen> list = commentMepper.findpage(page);
        page.setList(list);
        System.out.println(list);
         return page;
    }

    @Override
    public List<UserBean> getUserInfo(UserBean user) {

        List<UserBean> u= commentMepper.getUserInfo(user);
        if(u.size()>0){
            return u;
        }
        return null;
    }

    @Autowired
    private  HttpServletRequest request;
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
        comment.setId(StringUtil.getUUID());
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

    @Override
    public void insert(UserBean user) {
        commentMepper.insert(user);
    }

    @Override
    public UserBean findbyid(UserBean user) {

        List<UserBean> list= commentMepper.find(user);
        if(list.size()>0){
            user=list.get(0);
        }
        return user;
    }

    @Override
    public Boolean updategroupbyuser(Integer id, int groupvip) {
        boolean b=true;
        try {
            commentMepper.delgroupbyuser(id);
            GroupUser groupUser=new GroupUser();
            groupUser.setGroupid(groupvip);
            groupUser.setUserid(id);
            commentMepper.insertgroupUser(groupUser);
        } catch (Exception e) {
            e.printStackTrace();
            b=false;
        }
        return b;
    }

    @Override
    public Object isusername(String login) {
        String flag="1";
        UserBean user=new UserBean();
        user.setLogin(login);
        List<UserBean> list = commentMepper.find(user);
        if(list.size()>0){
            flag="0";
        }
        return flag;
    }

    @Override
    public void updateuseronlinetime(UserBean user) {
        commentMepper.updateuseronlinetime(user);

    }

    @Override
    public void insertss(Jifen jifen) {
        jifen.setCreatetime(Tool.getyyyyMMddHHmmss());
        commentMepper.insertss(jifen);
        commentMepper.updatejifen(jifen.getUserid());
    }

    @Override
    //查询当天积分次数，只需要传入type
    public int findnowcount(Jifen Jifen) {
        return commentMepper.findnowcount(Jifen);
    }



    @Override
    public Map<String, Object> login(UserBean user ) {
        Map<String, Object> map=new HashMap<String, Object>();
       if(user.getYanzhengma() !=null &&user.getYanzhengma().equals("")){
           if(!user.getYanzhengma().equals(user.getYanzhengma())){
               /*验证码错误！*/
               map.put("flag","77");
           }
       }

        String flag="99";
        String s1 = Tool.MD5(user.getUpwds());
        user.setUpwds(s1);

        List<UserBean> list = commentMepper.find(user);
        if(list.size()>0){
            List<String> collect = list.stream().map(UserBean::getUpwds).collect(Collectors.toList());
            String s = collect.toString();
           /* String pwd = user.getUpwds();
              pwd= Tool.MD5(pwd);*/

            if(list.get(0).getUpwds().equals(user.getUpwds())){
                UserBean userBean = list.get(0);
                flag=list.get(0).getFlag();
                if("1".equals(flag)){
                    user=list.get(0);
                    map.put("flag","66");
                    map.put(PublicStatic.USER,  userBean);
                      user.setLastlogintime(Tool.getyyyyMMddHHmmss());
                    commentMepper.update(user);
                  }

            }
        }else{
            map.put("flag","88");
        }
        return map;
    }

    @Override
    public void update(UserBean user) {
        commentMepper.update(user);
    }

    @Override
    public UserBean findbyuserid(Integer id) {

            return  commentMepper.findInfoById(id);
    }

    @Override
    public List<UserBean> findUserInfo(UserBean users) {
        return commentMepper.find(users);
    }

    @Override
    public Integer getCount() {
        return commentMepper.getUsercount();
    }


    public List<Comment> getCommentByPage(Comment comment) {
        return commentMepper.getCommentByPage(comment);
    }


}
