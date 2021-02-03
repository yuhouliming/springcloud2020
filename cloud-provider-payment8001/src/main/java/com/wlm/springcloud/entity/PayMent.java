package com.wlm.springcloud.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class PayMent implements Serializable {


    private Long id;

    private String serial;
}
