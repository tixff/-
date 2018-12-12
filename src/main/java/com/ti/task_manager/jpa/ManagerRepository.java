package com.ti.task_manager.jpa;

import com.ti.task_manager.entities.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Ti
 * @date 2018/12/12
 */

public interface ManagerRepository extends JpaRepository<Manager,Integer> {
}
