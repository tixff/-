package com.ti.task_manager.domain;

import lombok.Data;

/**
 * @author Ti
 * @date 2018/12/12
 */

@Data
public class MailMessage {

    private String name;

    private String text;

    private String destination;

}
