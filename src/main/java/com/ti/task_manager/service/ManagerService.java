package com.ti.task_manager.service;

import com.ti.task_manager.entities.Manager;

public interface ManagerService {

    void addManager(Manager manager);

    Manager findById(Integer id);

    Manager login(Manager manager);
}
