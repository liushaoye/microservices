package com.baidu.www.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/******************************
 * @author : liuyang
 * <p>ProjectName:microservices  </p>
 * @ClassName :  DeptProvider8001ConfigApp
 * @date : 2018/9/20 0020
 * @time : 16:16
 * @createTime 2018-09-20 16:16
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient //服务发现
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
public class DeptProvider8001ConfigApp {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001ConfigApp.class, args);
    }
}
