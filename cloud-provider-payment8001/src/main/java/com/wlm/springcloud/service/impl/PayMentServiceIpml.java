package com.wlm.springcloud.service.impl;

import com.wlm.springcloud.dao.PaymentDao;
import com.wlm.springcloud.entity.PayMent;
import com.wlm.springcloud.service.IPayMentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayMentServiceIpml implements IPayMentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int save(PayMent payMent) {
        return paymentDao.save(payMent);
    }

    @Override
    public PayMent getPayMentById(Long id) {
        return paymentDao.getPayMentById(id);
    }
}
