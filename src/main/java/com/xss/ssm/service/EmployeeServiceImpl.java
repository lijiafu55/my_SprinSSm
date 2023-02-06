package com.xss.ssm.service;

import com.xss.ssm.mapper.EmployeeMapper;
import com.xss.ssm.pojo.Employee;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/*
  @ 2023， 02， 05， 09，31
  @ 15303  springSSM
  @ 15303  com.xss.ssm.service 9:31
*/
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
    /* @Autowired
       *protected SqlSessionFactory sqlSessionFactory;
    */
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getAllEmployee() {

        return employeeMapper.getAllEmployee();
    }



}
