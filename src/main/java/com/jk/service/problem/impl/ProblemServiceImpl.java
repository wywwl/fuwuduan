package com.jk.service.problem.impl;

import com.jk.mapper.problem.PrtoblemMapper;
import com.jk.model.problem.Problem;
import com.jk.service.problem.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemServiceImpl implements ProblemService {

     @Autowired
     private PrtoblemMapper prtoblemMapper;

    //查询
    @Override
    public List<Problem> queryProblem(Integer id) {
        return prtoblemMapper.queryProblem(id);
    }
    //条件查询
    @Override
    public List<Problem> queryLicke(Problem problem) {
        return prtoblemMapper.queryLicke(problem);
    }
}
