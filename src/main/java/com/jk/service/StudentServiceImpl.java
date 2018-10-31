package com.jk.service;

import com.jk.mapper.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {


    @Override
    public void hh() {
        System.out.println("成功了");
    }

    @Autowired
    private StudentDao studentDao;


}
