package com.jk.service;

import com.jk.mapper.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;
    @Override
    public void hh() {
        System.out.println("成功了");
    }




}
