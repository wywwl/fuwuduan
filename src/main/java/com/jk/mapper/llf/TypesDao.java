package com.jk.mapper.llf;

import com.jk.model.ActivityBean;
import com.jk.model.Admins;
import com.jk.model.Advertisement;
import com.jk.model.TypesBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TypesDao {

    long getCount(ActivityBean activityBean);

    List<Advertisement> queryList(@Param("st") int start, @Param("rows") int rows, @Param("activityBean") ActivityBean activityBean);

    void remUserById(String[] ids);

    List<Admins> queryAdmin();

    void addAct(ActivityBean activityBean);

    List<ActivityBean> toAct();

    List<ActivityBean> exportXlsx(ActivityBean activityBean);
}
