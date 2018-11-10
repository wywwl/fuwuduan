package com.jk.service.llf;

import com.jk.model.ActivityBean;
import com.jk.model.Admins;

import java.util.List;
import java.util.Map;

public interface TypesService {

    Map<String, Object> queryList(int page, int rows, ActivityBean activityBean);

    void remUserById(String[] ids);

    List<Admins> queryAdmin();

    void addAct(ActivityBean activityBean);

    List<ActivityBean> toAct();

    List<ActivityBean> exportXlsx(ActivityBean activityBean);

}
