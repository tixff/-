package com.ti.task_manager.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Ti
 * @date 2018/12/13
 */

@Data
@Component
@ConfigurationProperties(prefix = "mail")
public class Mail {
    private String username;

    private String password;
}
