package com.ti.task_manager.service;

import com.ti.task_manager.entities.Employee;

import java.util.ArrayList;

/**
 *
 *@author lxl
 *@createtime 2018/12/4
 *
 */
public interface EmployeeService {
    void addEmployee(Employee e);

    ArrayList<Employee> findEmployee(Employee e);
}
