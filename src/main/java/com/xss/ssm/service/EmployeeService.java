package com.xss.ssm.service;

import com.github.pagehelper.PageInfo;
import com.xss.ssm.pojo.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployee();


    PageInfo<Employee> getPageAllEmployee(Integer pageNum);

    boolean login(String username, String username1);
}
