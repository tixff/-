package com.ti.task_manager.service;

import com.ti.task_manager.domain.DeptTreeNode;
import com.ti.task_manager.entities.Department;

import java.util.ArrayList;

/**
 * @author lxl
 * @createtime 2018/12/4
 */
public interface DepartmentService {
    ArrayList<Department> findSonDepartmentById(Integer id);

    ArrayList<DeptTreeNode> getTreeDept();
}
