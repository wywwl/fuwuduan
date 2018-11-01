package com.jk.mapper.userMapper;

import com.jk.model.userModel.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 王玉荣
 */
@Mapper
public interface UserMapper {

    @Select("select * from t_user where name = #{name}")
    List<UserBean> checkName(@Param("name")String name);
}
