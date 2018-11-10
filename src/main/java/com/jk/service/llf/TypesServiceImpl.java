package com.jk.service.llf;
import com.alibaba.fastjson.JSON;
import com.jk.mapper.llf.TypesDao;
import com.jk.model.ActivityBean;
import com.jk.model.Admins;
import com.jk.model.Advertisement;
import com.jk.model.TypesBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TypesServiceImpl implements TypesService{

    @Autowired
    private TypesDao typesDao;


    @Override
    public Map<String, Object> queryList(int page, int rows, ActivityBean activityBean) {
        Map<String, Object> map = new HashMap<>();

        long count = typesDao.getCount(activityBean);
        int start = (page-1)*rows;

        List<Advertisement> ulist = typesDao.queryList(start,rows,activityBean);
        map.put("total", count);
        map.put("rows", ulist);
        return map;
    }

    @Override
    public void remUserById(String[] ids) {
        typesDao.remUserById(ids);
    }

    @Override
    public List<Admins> queryAdmin() {
        return typesDao.queryAdmin();
    }

    @Override
    public void addAct(ActivityBean activityBean) {
        typesDao.addAct(activityBean);
    }

    @Override
    public List<ActivityBean> toAct() {
        return typesDao.toAct();
    }

    @Override
    public List<ActivityBean> exportXlsx(ActivityBean activityBean) {
        return typesDao.exportXlsx(activityBean);
    }

}
