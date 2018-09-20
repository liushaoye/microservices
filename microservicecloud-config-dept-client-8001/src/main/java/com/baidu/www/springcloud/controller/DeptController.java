package com.baidu.www.springcloud.controller;

import com.baidu.www.springcloud.entity.Dept;
import com.baidu.www.springcloud.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/******************************
 * @author : liuyang
 * <p>ProjectName:microservicecloud  </p>
 * @ClassName :  DeptController
 * @date : 2018/8/24 0024
 * @time : 19:22
 * @createTime 2018-08-24 19:22
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

@RestController
@Slf4j
public class DeptController {

    @Autowired
    private DeptService deptService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "dept/add", method = RequestMethod.POST)
    public boolean add(Dept dept) {
        return deptService.add(dept);
    }

    @RequestMapping(value = "dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id) {
        return deptService.get(id);
    }

    @RequestMapping(value = "dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return deptService.list();
    }

//    @RequestMapping(value = "dept/discovery", method = RequestMethod.GET)
//    public Object discovery() {
//
//        List<String> list = discoveryClient.getServices();
//
//        log.info("***************" + list);
//
//        List<ServiceInstance> serviceInstances = discoveryClient.getInstances(
//                "MICROSERVICECLOUD-DEPT");
//
//        serviceInstances.forEach(serviceInstance -> log.info("" + serviceInstance.getServiceId() + "\t"
//                + serviceInstance.getHost() + "\t" + serviceInstance.getPort() + "\t" + serviceInstance.getUri()
//        ));
//
//        return this.discoveryClient;
//    }


}
