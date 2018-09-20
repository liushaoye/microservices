package com.baidu.www.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * EurekaServer服务器端启动类,接受其它微服务注册进来
 *
 * @author zhouyang
 */
@SpringBootApplication
@EnableEurekaServer
public class ConfigGitEurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigGitEurekaServerApplication.class, args);
    }
}
