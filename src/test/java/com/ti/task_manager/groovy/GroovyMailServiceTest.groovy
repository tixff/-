package com.ti.task_manager.groovy

import com.ti.task_manager.domain.MailMessage
import com.ti.task_manager.service.MailService
import org.springframework.beans.factory.annotation.Autowired

class GroovyMailServiceTest extends GroovyAbstractTest {

    @Autowired
    private MailService mailService

    def message = new MailMessage()


    def 测试发送邮件() {
        given:
        message.with {
            name = "杰瑞"
            text = "你好杰瑞，我是汤姆，我很想你"
        }
        mailService.sendMail(message)

    }
}
