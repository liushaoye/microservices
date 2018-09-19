package com.baidu.www.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Administrator
 */

@SpringBootApplication
@EnableZuulProxy
public class Zuul9527StartSpringCloudApp {
    public static void main(String[] args) {
        SpringApplication.run(Zuul9527StartSpringCloudApp.class, args);
    }
}
