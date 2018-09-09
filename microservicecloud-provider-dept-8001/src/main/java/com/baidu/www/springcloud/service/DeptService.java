package com.baidu.www.springcloud.service;

import com.baidu.www.springcloud.entity.Dept;

import java.util.List;

/******************************
 * @author : liuyang
 * <p>ProjectName:microservicecloud  </p>
 * @ClassName :  DeptService
 * @date : 2018/8/24 0024
 * @time : 18:15
 * @createTime 2018-08-24 18:15
 * @version : 2.0
 * @description :
 *
 *       命名方式采用RESTFUL命名方式
 *
 *******************************/


public interface DeptService {

    /**
     * 添加 部门
     *
     * @param dept
     * @return
     */
    boolean add(Dept dept);

    /**
     * 查询所有部门
     *
     * @return
     */
    List<Dept> list();

    /**
     * 查询所有部门
     *
     * @param id
     *
     * @return
     */
    Dept get(Long id);

}
