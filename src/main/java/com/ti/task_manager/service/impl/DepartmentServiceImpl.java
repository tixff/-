package com.ti.task_manager.service.impl;

import com.ti.task_manager.domain.DeptTreeNode;
import com.ti.task_manager.entities.Department;
import com.ti.task_manager.entities.DepartmentExample;
import com.ti.task_manager.mapper.DepartmentMapper;
import com.ti.task_manager.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ti
 * @date 2018/12/4
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper mapper;

    @Override
    public ArrayList<Department> findSonDepartmentById(Integer id) {
        DepartmentExample example = new DepartmentExample();
        DepartmentExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(id);
        ArrayList<Department> departments = (ArrayList<Department>) mapper.selectByExample(example);
        return departments;
    }

    @Override
    public ArrayList<DeptTreeNode> getTreeDept() {
        List<Department> departments = mapper.selectByExample(new DepartmentExample());
        ArrayList<DeptTreeNode> deptTreeNodes = toFormatTreeDept(departments);
        return deptTreeNodes;
    }

    private ArrayList<DeptTreeNode> toFormatTreeDept(List<Department> list) {
        if (list == null || list.size() < 1) {
            return null;
        }
        ArrayList<Department> treeList = new ArrayList<>();
        //获取所有的一级部门
        list.forEach(o -> {
            if (o.getParentId() == 0) {
                treeList.add(o);
            }
        });
        ArrayList<DeptTreeNode> depts = new ArrayList<>();
        treeNode(treeList, list, depts);
        return depts;
    }

    private void treeNode(ArrayList<Department> nodes, List<Department> list, ArrayList<DeptTreeNode> rootDepts) {
        if (nodes == null || nodes.size() < 1) {
            return;
        }

        for (int i = 0; i < nodes.size(); i++) {
            Department node = nodes.get(i);
            DeptTreeNode deptTreeNode = new DeptTreeNode();
            if (node.getIsParent() != 1) {
                deptTreeNode.setText(node.getName());
                rootDepts.add(deptTreeNode);
                continue;
            }


            Integer id = node.getId();
            deptTreeNode.setText(node.getName());

            ArrayList<DeptTreeNode> children = new ArrayList<>();
            ArrayList<Department> sonList = new ArrayList<>();
            list.forEach(o -> {
                if (o.getParentId() == id) {
                    sonList.add(o);
                }
            });
            deptTreeNode.setChildren(children);
            rootDepts.add(deptTreeNode);
            treeNode(sonList, list, children);
        }
    }
}
