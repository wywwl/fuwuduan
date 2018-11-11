package com.jk.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.jk.mapper.StudentDao;
import com.jk.model.Advertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentDao studentDao;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public void hh() {
        System.out.println("成功了");
    }

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
        List<Advertisement> adveList =  studentDao.gettest();
        String s = JSONArray.toJSONString(adveList);
        redisTemplate.opsForValue().set("advertisementRedis",s);
    }

    @Override
    public void addStu(Advertisement advertisement){
    try {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        long time = simpleDateFormat.parse(advertisement.getStarttime()).getTime();
//        long times = simpleDateFormat.parse(advertisement.getEndtime()).getTime();
//        advertisement.setSecondtime(times-time);
        studentDao.addStu(advertisement);
        List<Advertisement> adveList =  studentDao.gettest();
        String s = JSONArray.toJSONString(adveList);
        redisTemplate.opsForValue().set("advertisementRedis",s);
    }  catch (Exception e){
    }
    }

        @Override
    public Advertisement getStuById(Advertisement advertisement) {
        return studentDao.getStuById(advertisement);
    }

    @Override
    public void updateStu(Advertisement advertisement) {
        studentDao.updateStu(advertisement);
    }

    @Override
    public List<Advertisement> gettest() {
        return studentDao.gettest();
    }

    @Override
    public List<Advertisement> exportXlsx(Advertisement advertisement) {
        return studentDao.exportXlsx(advertisement);
    }


}
