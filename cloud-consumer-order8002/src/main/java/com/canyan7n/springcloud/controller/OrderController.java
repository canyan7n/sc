package com.canyan7n.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :OrderController
 * @date ：2023/5/20 18:16
 * @description：TODO
 */
@RestController
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;
}
