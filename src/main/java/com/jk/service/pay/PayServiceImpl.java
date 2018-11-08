package com.jk.service.pay;

import com.jk.mapper.pay.PayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 王玉荣
 */
@Service
public class PayServiceImpl implements PayService{

    @Autowired
    private PayMapper payMapper;
    @Override
    public void updatecoun(Integer nbcount, Integer id) {
        payMapper.updatecoun(nbcount);
    }
}
