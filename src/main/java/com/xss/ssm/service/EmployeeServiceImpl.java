package com.xss.ssm.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xss.ssm.mapper.EmployeeMapper;
import com.xss.ssm.pojo.Employee;
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

    @Override
    public PageInfo<Employee> getPageAllEmployee(Integer pageNum) {
        PageHelper.startPage(pageNum, 7);
        // 查询所有信息
        List<Employee> list = employeeMapper.getAllEmployee();
        //获取分页相关数据
        PageInfo<Employee> page = new PageInfo<Employee>(list, 5);
        return page;
    }

    @Override
    public boolean login(String username, String password) {
        if(employeeMapper.login(username, password)==1){
            return true;
        }
        return false;
    }


}
