package com.canyan7n.springcloud.dao;

import com.canyan7n.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
    public void create(Payment payment);
    public Payment getPaymentById(@Param("id") Integer id);
}
