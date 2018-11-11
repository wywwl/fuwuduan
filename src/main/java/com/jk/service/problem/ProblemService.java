package com.jk.service.problem;


import com.jk.model.problem.Problem;

import java.util.List;

public interface ProblemService {

    //问题集合
    List<Problem> queryProblem(Integer id);

    //条件查询
    List<Problem> queryLicke(Problem problem);
 }
