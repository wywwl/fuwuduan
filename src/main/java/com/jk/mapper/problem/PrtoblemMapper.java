package com.jk.mapper.problem;


import com.jk.model.problem.Problem;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


import java.util.List;

public interface PrtoblemMapper {
    //集合的查询
    @Select("SELECT * from t_user_problem p,t_user u,t_probem e,t_content c where p.userid = u.id and p.problemid=e.id\n" +
            "and e.typeid= c.id and u.id = #{id}")
    List<Problem> queryProblem(@Param("id")Integer id);

    @Select("SELECT * from t_user_problem p,t_user u,t_probem e,t_content c where p.userid = u.id and p.problemid=e.id\\n\" +\n" +
            "            \"and e.typeid= c.id and u.id = #{id} and e.tname like '%#{problem.tname}%'")
    List<Problem> queryLicke(@Param("problem") Problem problem);
}
