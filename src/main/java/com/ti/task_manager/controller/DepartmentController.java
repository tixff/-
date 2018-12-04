package com.ti.task_manager.controller;

import com.ti.task_manager.domain.DeptTreeNode;
import com.ti.task_manager.entities.Department;
import com.ti.task_manager.service.DepartmentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author Ti
 * @date 2018/12/4
 */
@RestController
@RequestMapping("/dept")
@Api(value = "部门管理", tags = "部门管理")
public class DepartmentController {
    @Autowired
    private DepartmentService service;

    @GetMapping("search")
    @ApiOperation(value = "查找子部门", notes = "查找子部门")
    public ArrayList<Department> findSonDept(
                    Integer id) {
        ArrayList<Department> departments = service.findSonDepartmentById(id);
        return departments;
    }

    @GetMapping("all")
    @ApiOperation(value = "树形部门数据",notes = "树形部门数据")
    public ArrayList<DeptTreeNode> getTreeDeptData(){
        ArrayList<DeptTreeNode> treeDept = service.getTreeDept();
        return treeDept;
    }
}
