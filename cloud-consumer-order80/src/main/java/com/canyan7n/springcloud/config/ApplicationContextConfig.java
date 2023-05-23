package com.canyan7n.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :ApplicationContextConfig
 * @date ：2023/5/20 18:24
 * @description：TODO
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
