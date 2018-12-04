package com.ti.task_manager.service.impl;

import com.ti.task_manager.entities.Manager;
import com.ti.task_manager.mapper.ManagerMapper;
import com.ti.task_manager.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 *@author lxl
 *@createtime 2018/12/4
 *
 */
@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerMapper mapper;

    @Override
    @Transactional
    public void addManager(Manager manager) {
        mapper.insert(manager);
    }

    @Override
    public Manager findById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public Manager login(Manager manager) {
        Manager m = mapper.findByNameAndPassword(manager);
        return m;
    }
}
