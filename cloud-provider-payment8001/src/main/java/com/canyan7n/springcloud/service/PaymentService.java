package com.canyan7n.springcloud.service;

import com.canyan7n.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    Integer create(Payment payment);
    Payment getPaymentById(Integer id);
}
