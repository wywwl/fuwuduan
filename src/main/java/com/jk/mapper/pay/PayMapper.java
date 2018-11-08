package com.jk.mapper.pay;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * 王玉荣
 */
@Mapper
public interface PayMapper {

    @Update("update t_user set nbcount=nbcount+#{nbcount} where id =#{id} ")
    void addusernb(@Param("nbcount") Integer nbcount, Integer id);
    @Update("update t_user set nbcount=nbcount=#{nbcount},jifen=jifen+#{nbcount}*10 ")
    void updatecoun(Integer nbcount);
}
