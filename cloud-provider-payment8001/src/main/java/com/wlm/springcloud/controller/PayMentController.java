package com.wlm.springcloud.controller;

import com.wlm.springcloud.entity.CommonResult;
import com.wlm.springcloud.entity.PayMent;
import com.wlm.springcloud.service.IPayMentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/payment")
public class PayMentController {

    @Autowired
    private IPayMentService iPayMentService;

    @PostMapping(value = "/save")
    public CommonResult create(@RequestBody PayMent payMent) {
        int res = iPayMentService.save(payMent);
        if (res > 0) {
            return new CommonResult(200, "成功", res);
        }
        return new CommonResult(500, "失败");
    }

    @GetMapping(value = "/get/{id}")
    public CommonResult get(@PathVariable("id") Long id) {
        PayMent payMent = iPayMentService.getPayMentById(id);
        if (payMent != null) {
            return new CommonResult(200, "成功", payMent);
        }
        return new CommonResult(500, "失败");

    }
}
