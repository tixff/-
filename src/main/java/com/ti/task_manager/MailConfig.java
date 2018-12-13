package com.ti.task_manager;

import com.ti.task_manager.config.Mail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSenderImpl;

/**
 * @author Ti
 * @date 2018/12/12
 */

@Configuration
public class MailConfig {

    @Autowired
    private Mail mail;

    /**
     * 配置邮件发送器
     *
     * @return
     */
    @Bean
    public JavaMailSenderImpl mailSender() throws Exception{
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.qq.com");
        mailSender.setPassword(mail.getPassword());
        mailSender.setUsername(mail.getUsername());
        return mailSender;
    }

    /**
     * 配置邮件发送模板
     *
     * @return
     */
    /*@Bean
    public SpringTemplateEngine springTemplateEngine() {
        SpringTemplateEngine engine = new SpringTemplateEngine();
        //engine.setTemplateResolver(templateResolver());
        return engine;
    }*/

    /*@Bean
    public ClassLoaderTemplateResolver templateResolver() {
        ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
        templateResolver.setPrefix("/templates/");
        templateResolver.setTemplateMode("HTML5");
        templateResolver.setCharacterEncoding("utf-8");
        templateResolver.setSuffix(".html");
        templateResolver.setOrder(2);
        return templateResolver;
    }*/
}
