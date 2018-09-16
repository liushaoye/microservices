package com.baidu.www.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Administrator
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.baidu.www.springcloud"})
@ComponentScan("com.baidu.www.springcloud")
public class MicroservicecloudProviderDeptFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudProviderDeptFeignApplication.class, args);
    }
}
