package com.canyan7n.springcloud.service.impl;

import com.canyan7n.springcloud.dao.PaymentDao;
import com.canyan7n.springcloud.entities.Payment;
import com.canyan7n.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :PaymentServiceImpl
 * @date ：2023/5/20 16:40
 * @description：TODO
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;
    @Override
    public Integer create(Payment payment) {
        return paymentDao.create(payment);
    }
    @Override
    public Payment getPaymentById(Integer id) {
        return paymentDao.getPaymentById(id);
    }
}
