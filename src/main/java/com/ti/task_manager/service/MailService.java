package com.ti.task_manager.service;

import com.ti.task_manager.domain.MailMessage;

public interface MailService {
    void sendMail(MailMessage message) throws Exception;
}
