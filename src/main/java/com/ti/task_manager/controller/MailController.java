package com.ti.task_manager.controller;

import com.ti.task_manager.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Ti
 * @date 2018/12/12
 */

@Controller
public class MailController {

    @Autowired
    private MailService service;

    /*@GetMapping("/mail/send")
    public String sendMail(){
        try {
            service.sendMail();
        } catch (Exception e) {
            System.out.println("！！！！！！发送失败");
            e.printStackTrace();
        }
        return "mailtemplate";
    }*/

    @GetMapping("/mail/template")
    public String template(){
        return "mailtemplate";
    }
}
