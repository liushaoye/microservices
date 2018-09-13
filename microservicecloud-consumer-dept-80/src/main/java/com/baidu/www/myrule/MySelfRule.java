package com.baidu.www.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/******************************
 * @author : liuyang
 * <p>ProjectName:microservices  </p>
 * @ClassName :  MySelfRule
 * @date : 2018/9/13 0013
 * @time : 19:37
 * @createTime 2018-09-13 19:37
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

@Configuration
public class MySelfRule {


    /**
     * 用重新选择的随机算法,替代默认的算法
     *
     * @return
     */
    @Bean
    public IRule myRule() {

        // 每台机器五次
        return new RandomRule_ZY();
    }
}
