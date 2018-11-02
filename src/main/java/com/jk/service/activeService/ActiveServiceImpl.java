package com.jk.service.activeService;

import com.alibaba.fastjson.JSONObject;
import com.jk.mapper.activeMapper.ActiveMapper;
import com.jk.model.activeModel.ActiveBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 王玉荣
 */
@Service
public class ActiveServiceImpl implements ActiveService {

    @Autowired
    private ActiveMapper activeMapper;

    public Map<String, Object> queryactive(int page, int rows, ActiveBean activeBean) {
        long count = (long) activeMapper.getactivecount();
        Map<String, Object>  obj = new HashMap<String, Object>();
        int start=(page-1)*rows;
        List<ActiveBean> list=activeMapper.queryactive(start,rows,activeBean);
        obj.put("total", count);
        obj.put("rows", list);
        return obj;
    }

    public void remAactiveById(String ids) {
        String[] kk = ids.split(",");
        for (int i = 0; i < kk.length; i++) {
            activeMapper.delectactive(kk[i]);
        }
    }
}
