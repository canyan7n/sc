package com.canyan7n.springcloud.controller;

import com.canyan7n.springcloud.entities.CommenResult;
import com.canyan7n.springcloud.entities.Payment;
import com.canyan7n.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public CommenResult create(Payment payment){
        int result;
        result = paymentService.create(payment);
        if (result > 0){
            log.info("插入结果" + result + "xxxx");
            return new CommenResult(200,"插入成功",result);
        }else {
            return new CommenResult(444,"插入失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommenResult getPaymentById(@PathVariable("id") Integer id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("查询成功" + payment);
        if (payment!=null){
            return new CommenResult(200,"查询成功",payment);
        }else {
            return new CommenResult(444,"查询失败，没有"+id,null);
        }
    }
}
