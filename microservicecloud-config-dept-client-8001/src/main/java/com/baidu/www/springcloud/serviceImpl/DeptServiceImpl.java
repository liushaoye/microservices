package com.baidu.www.springcloud.serviceImpl;

import com.baidu.www.springcloud.dao.DeptDao;
import com.baidu.www.springcloud.entity.Dept;
import com.baidu.www.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;

/******************************
 * @author : liuyang
 * <p>ProjectName:microservicecloud  </p>
 * @ClassName :  DeptServiceImpl
 * @date : 2018/8/24 0024
 * @time : 18:18
 * @createTime 2018-08-24 18:18
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

@ComponentScan({"com.baidu.www.springcloud.dao"})
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean add(Dept dept) {
        return deptDao.insertSelective(dept);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }

    @Override
    public Dept get(Long id) {
        return deptDao.selectByPrimaryKey(id);
    }
}
