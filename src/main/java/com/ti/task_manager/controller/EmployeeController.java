package com.ti.task_manager.controller;

import com.ti.task_manager.entities.Employee;
import com.ti.task_manager.service.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author Ti
 * @date 2018/12/4
 */

@RestController
@RequestMapping("/emp")
@Api(value = "员工管理", tags = "员工管理")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/add")
    @ApiOperation(value = "添加员工", notes = "添加员工")
    public void addEmp(Employee employee) {
        service.addEmployee(employee);
    }

    @GetMapping("/search")
    @ApiOperation(value = "查询员工", notes = "查询员工")
    public ArrayList<Employee> searchEmp(Employee employee) {
        ArrayList<Employee> list = service.findEmployee(employee);
        return list;
    }
}
