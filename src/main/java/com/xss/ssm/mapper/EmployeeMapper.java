package com.xss.ssm.mapper;

import com.xss.ssm.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/*
  @ 2023， 02， 05， 09，50
  @ 15303  springSSM
  @ 15303  com.xss.ssm.mapper 9:50
*/
public interface EmployeeMapper {


    List<Employee> getAllEmployee();


    int login(@Param("username") String username, @Param("password") String password);
}
