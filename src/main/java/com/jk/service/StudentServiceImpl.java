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
    public void addStu(Advertisement advertisement){
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");//时间格式
            long time = simpleDateFormat.parse(advertisement.getStarttime()).getTime();//转换成毫秒值
            advertisement.setSecondtime(time);
            studentDao.addStu(advertisement);
            //查询出所有存入redis
            List<Advertisement> AdvertList = studentDao.getAdvertList();
            String listString = JSONArray.toJSONString(AdvertList);
            redisTemplate.opsForValue().set("advertisementRedis",listString);
        }catch (Exception e){
            e.printStackTrace();
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

    public void hh() {
        System.out.println("成功");
    }
}
