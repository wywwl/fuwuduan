package com.jk.service.userService;

import com.alibaba.fastjson.JSONObject;
import com.jk.mapper.userMapper.UserMapper;
import com.jk.model.userModel.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 王玉荣
 *
 * 这是登陆的接口
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    public JSONObject loginuser(UserBean user) {
        JSONObject json = new JSONObject();
        int flag = 0; // 0：用户名不存在  1：密码错误 2：登录成功
        //根据账号名查询数据库    查不到 则 用户名错误
        List<UserBean> teaList = userMapper.checkName(user.getName());
        if(teaList != null && teaList.size()>0){//如果能查到数据 说明 用户名没问题
            flag = 1;
//			从集合中取出teacher对象   如果集合长度 >1  也默认使用第一个对象
            UserBean dbTea = teaList.get(0);
            //用页面传过来的密码 与 数据库中查出来的密码作对比
            System.out.println(dbTea.getUpwds());
            System.out.println(user.getUpwds());

            if(user.getUpwds().equals(dbTea.getUpwds())){
                //如果一致 则登录成功upwds
                flag = 2;
                json.put("loginTeacher", dbTea);
            }
        }
        json.put("flag", flag);
        return json;
    }
}
