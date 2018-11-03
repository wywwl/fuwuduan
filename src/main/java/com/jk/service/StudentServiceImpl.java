package com.jk.service;

import com.jk.mapper.StudentDao;
import com.jk.model.Advertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentDao studentDao;



    @Override
    public Map<String, Object> queryList(int page, int rows, Advertisement advertisement) {
        Map<String, Object> map = new HashMap<>();

        long count = studentDao.getCount(advertisement);
        int start = (page-1)*rows;

        List<Advertisement> ulist = studentDao.queryList(start,rows,advertisement);
        map.put("total", count);
        map.put("rows", ulist);
        return map;
    }

    @Override
    public void remUserById(String[] ids) {
        studentDao.remUserById(ids);
    }

    @Override
    public void addStu(Advertisement advertisement) {
        studentDao.addStu(advertisement);
    }

    @Override
    public Advertisement getStuById(Advertisement advertisement) {
        return studentDao.getStuById(advertisement);
    }

    @Override
    public void updateStu(Advertisement advertisement) {
        studentDao.updateStu(advertisement);
    }


    public void hh() {
        System.out.println("成功");
    }
}
