package com.jk.service.userService;

import com.alibaba.fastjson.JSONObject;
import com.jk.model.userModel.UserBean;

/**
 * 王玉荣
 */
public interface UserService {

    JSONObject loginuser(UserBean user);

}
