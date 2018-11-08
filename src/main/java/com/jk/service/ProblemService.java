package com.jk.service;


import com.jk.model.Problem;

import java.util.List;

public interface ProblemService {

    //问题集合
    List<Problem> queryProblem(Integer id);

    //条件查询
    List<Problem> queryLicke(Problem problem);
 }
