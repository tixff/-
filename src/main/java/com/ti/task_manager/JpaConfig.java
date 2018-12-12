package com.ti.task_manager;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Ti
 * @date 2018/12/12
 */

@Configuration
@EnableJpaRepositories(basePackages = "com.ti.task_manager")
public class JpaConfig {

}
