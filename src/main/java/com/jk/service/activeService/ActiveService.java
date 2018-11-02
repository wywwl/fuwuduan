package com.jk.service.activeService;

import com.alibaba.fastjson.JSONObject;
import com.jk.model.activeModel.ActiveBean;

import java.util.Map;

/**
 * 王玉荣
 */
public interface ActiveService {

    Map<String, Object> queryactive(int page, int rows, ActiveBean activeBean);

    void remAactiveById(String ids);

}
