package com.wlm.springcloud.service;

import com.wlm.springcloud.entity.PayMent;
import org.apache.ibatis.annotations.Param;

public interface IPayMentService {
    int save(PayMent payMent);

    PayMent getPayMentById(@Param("id") Long id);
}
