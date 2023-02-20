package com.xss.ssm.controller;




import com.github.pagehelper.PageInfo;
import com.xss.ssm.pojo.Employee;
import com.xss.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/*
  @ 2023， 02， 04， 11，00
  @ 15303  springSSM
  @ 15303  com.xss.ssm.controller 11:00
*/
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    //查询所有员工信息
    @RequestMapping(value = "/employee",method = RequestMethod.GET)
    public String getAllEmployee(Model model) {
        List<Employee> list = employeeService.getAllEmployee();
        //将员工信息在请求域中共享
        model.addAttribute("list", list);
        //跳转到employee_list.html
        return "employee_list";
    }
    @RequestMapping(value = "/employee/page/{pageNum}",method = RequestMethod.GET)
    public String getEmployeePage(Model model, @PathVariable Integer pageNum) {
        //获取员工分页信息
        PageInfo<Employee> page = employeeService.getPageAllEmployee(pageNum);
        //将分页数据共享到请求域中
        model.addAttribute("page", page);
        return "employee_page";

    }

    @RequestMapping(value = "/registered")
    public String getRegistered() {
        return "registered";
    }
//
    @RequestMapping(value = "/Reset")
    public String getReset() {
        return "Reset";
    }
}
