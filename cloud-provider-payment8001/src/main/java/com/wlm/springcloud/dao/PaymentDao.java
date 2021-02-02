package com.wlm.springcloud.dao;

import com.wlm.springcloud.entity.PayMent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
     int save(PayMent payMent);

     PayMent getPayMentById(@Param("id") Long id);
}
