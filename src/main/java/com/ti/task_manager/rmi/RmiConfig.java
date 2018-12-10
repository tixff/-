package com.ti.task_manager.rmi;

import com.ti.task_manager.service.DepartmentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

/**
 * @author Ti
 * @date 2018/12/10
 */

@Configuration
public class RmiConfig {

    @Bean
    RmiServiceExporter rmiDeptExporter(DepartmentService service) {
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setService(service);
        exporter.setServiceName("deptService");
        exporter.setServiceInterface(DepartmentService.class);
        return exporter;
    }
}
