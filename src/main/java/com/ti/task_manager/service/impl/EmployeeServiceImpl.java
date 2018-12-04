package com.ti.task_manager.service.impl;

import com.ti.task_manager.entities.Employee;
import com.ti.task_manager.entities.EmployeeExample;
import com.ti.task_manager.mapper.EmployeeMapper;
import com.ti.task_manager.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ti
 * @date 2018/12/4
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper mapper;

    @Override
    public void addEmployee(Employee e) {
        mapper.insert(e);
    }

    @Override
    public ArrayList<Employee> findEmployee(Employee e) {
        EmployeeExample example = new EmployeeExample();
        EmployeeExample.Criteria criteria = example.createCriteria();
        if (e.getId() != null) {
            criteria.andIdEqualTo(e.getId());
        }

        if (e.getDeptId() != null) {
            criteria.andDeptIdEqualTo(e.getDeptId());
        }

        if (e.getPosition() != null) {
            criteria.andPositionEqualTo(e.getPosition());
        }
        ArrayList<Employee> employees = (ArrayList<Employee>) mapper.selectByExample(example);
        return employees;
    }

}
