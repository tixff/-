package com.ti.task_manager.service.impl;

import com.ti.task_manager.domain.MailMessage;
import com.ti.task_manager.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;

import javax.mail.internet.MimeMessage;

/**
 * @author Ti
 * @date 2018/12/12
 */

@Service
public class MailServiceImpl implements MailService {

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private SpringTemplateEngine engine;

    @Override
    public void sendMail(MailMessage message) throws Exception {
        //engine.setTemplateResolver(new DefaultTemplateResolver(){{setOrder(2);}});
        Context context = new Context();
        context.setVariable("name", message.getName());
        context.setVariable("text", message.getText());
        String process = engine.process("mailtemplate", context);

        //构建邮件消息
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true, "utf-8");
        helper.setFrom("447366453@qq.com");//510966974@qq.com
        helper.setTo(message.getDestination());
        helper.setSubject("通知");
        helper.setText(process, true);
        ClassPathResource resource = new ClassPathResource("static/mail.jpg");
        helper.addInline("img",resource);
        mailSender.send(mimeMessage);
    }
}
