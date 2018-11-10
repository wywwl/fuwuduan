package com.jk.service;

import com.jk.model.Advertisement;

import java.util.List;
import java.util.Map;

public interface StudentService {

    void hh();

    Map<String, Object> queryList(int page, int rows, Advertisement advertisement);

    void remUserById(String[] ids);

    void addStu(Advertisement advertisement);

    Advertisement getStuById(Advertisement advertisement);

    void updateStu(Advertisement advertisement);

    List<Advertisement> gettest();

    List<Advertisement> exportXlsx(Advertisement advertisement);

}
