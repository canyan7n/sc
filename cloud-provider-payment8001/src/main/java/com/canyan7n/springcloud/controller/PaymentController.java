package com.canyan7n.springcloud.controller;

import com.canyan7n.springcloud.entities.CommonResult;
import com.canyan7n.springcloud.entities.Payment;
import com.canyan7n.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author ：macheng
 * @ClassName :PaymentController
 * @date ：2023/5/20 16:43
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result;
        result = paymentService.create(payment);
        if (result > 0){
            log.info("插入结果" + result + payment);
            return new CommonResult(200,"插入成功",result);
        }else {
            return new CommonResult(444,"插入失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Integer id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("查询成功" + payment);
        if (payment!=null){
            return new CommonResult(200,"查询成功",payment);
        }else {
            return new CommonResult(444,"查询失败，没有"+id,null);
        }
    }
}
