package com.baidu.www.springcloud.dao;

import com.baidu.www.springcloud.entity.Dept;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/******************************
 * @author : liuyang
 * <p>ProjectName:microservicecloud  </p>
 * @ClassName :  DeptDao
 * @date : 2018/8/24 0024
 * @time : 17:48
 * @createTime 2018-08-24 17:48
 * @version : 2.0
 * @description :
 *
 *     部门的Dao层
 *
 *******************************/

@Repository
@Mapper
public interface DeptDao {

    @Delete("DELETE FROM dept WHERE deptno = #{deptno,jdbcType=BIGINT}")
    int deleteByPrimaryKey(Long deptno);

    @Insert("INSERT INTO dept (dname, db_source) VALUES(#{dname,jdbcType=VARCHAR},DATABASE())")
    boolean insertSelective(Dept record);

    @Select("select deptno,dname,db_source from dept where deptno = #{deptno,jdbcType=BIGINT}")
    Dept selectByPrimaryKey(Long deptno);

    @Update("update dept dname = #{dname,jdbcType=VARCHAR},db_source = #{dbSource,jdbcType=VARCHAR},where deptno = #{deptno,jdbcType=BIGINT}")
    int updateByPrimaryKeySelective(Dept record);

    @Update(" UPDATE dept SET dname= #{dname,jdbcType=VARCHAR},db_source = #{dbSource,jdbcType=VARCHAR} WHERE deptno = #{deptno,jdbcType=BIGINT}")
    int updateByPrimaryKey(Dept record);

    @Select("SELECT deptno,dname,db_source FROM dept")
    List<Dept> findAll();
}