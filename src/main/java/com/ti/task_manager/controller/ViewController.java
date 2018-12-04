package com.ti.task_manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Ti
 * @date 2018/12/4
 */

@Controller
public class ViewController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/form.html")
    public String form(){
        return "form";
    }

    @GetMapping("/table.html")
    public String table(){
        return "table";
    }
}
