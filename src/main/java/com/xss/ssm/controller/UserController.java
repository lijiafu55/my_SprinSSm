package com.xss.ssm.controller;

import com.xss.ssm.service.EmployeeService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
  @ 2023， 02， 12， 17，57
  @ 15303  springSSM
  @ 15303  com.xss.ssm.controller 17:57
*/
@Controller
public class UserController {

    @Autowired
    private EmployeeService employeeService;
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String username, String password) {
        System.out.println(username+password);
        if (employeeService.login(username,password)) {
           return "index";
        }
        return "error";
    }


}
