package com.jk.mapper;

import com.jk.model.Advertisement;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {

    long getCount(Advertisement advertisement);

    List<Advertisement> queryList(@Param("st")int start, @Param("rows")int rows, @Param("advertisement")Advertisement advertisement);

    void remUserById(String[] ids);

    void addStu(Advertisement advertisement);

    Advertisement getStuById(Advertisement advertisement);



    void updateStu(Advertisement advertisement);
}
