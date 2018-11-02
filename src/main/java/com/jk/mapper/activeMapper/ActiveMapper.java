package com.jk.mapper.activeMapper;

import com.jk.model.activeModel.ActiveBean;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 王玉荣
 */
@Mapper
public interface ActiveMapper {


    @Select("select count(*) from t_activity")
    public long getactivecount();

    @Select("select * from t_activity a,t_admin u where a.uid = u.aid limit #{start},#{end} ")
    List<ActiveBean> queryactive(@Param("start") int start,@Param("end") int rows, ActiveBean activeBean);

    @Delete("delete from t_activity where hid=#{id} ")
    void delectactive(@Param("id") String id);
}
