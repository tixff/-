package com.ti.task_manager.jpa;

import com.ti.task_manager.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Ti
 * @date 2018/12/12
 */

public interface UserRepository extends JpaRepository<User,Integer> {
}
