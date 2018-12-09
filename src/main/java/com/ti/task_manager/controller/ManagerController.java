package com.ti.task_manager.controller;

import com.ti.task_manager.domain.Result;
import com.ti.task_manager.entities.Manager;
import com.ti.task_manager.service.ManagerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manager")
@Api(value = "管理员操作",tags = "管理员操作")
public class ManagerController {
    @Autowired
    private ManagerService service;

    @PostMapping("add")
    @ApiOperation(value = "添加管理员", notes = "添加管理员")
    public void addManager(Manager m) {
        service.addManager(m);
    }

    @GetMapping("find")
    @ApiOperation(value = "查询管理员", notes = "通过id查询")
    @Cacheable("manager")
    public Result findById(
            Integer id) {
        Result result = new Result();
        Manager manager = service.findById(id);
        result.getData().put("manager", manager);
        return result;
    }

    @PostMapping("login")
    @ApiOperation(value = "管理员登录", notes = "管理员登录")
    public Result login(@ApiParam Manager manager) {
        Result result = new Result();
        //密码加密
        String password = DigestUtils.md5DigestAsHex(manager.getPassword().getBytes());
        manager.setPassword(password);
        Manager m = service.login(manager);
        if(m!=null){
            result.getData().put("manager",manager);
            return result;
        }
        result.getData().put("msg","用户名或密码错误");
        return result;
    }

    public static void main(String[] args) {
        String password = DigestUtils.md5DigestAsHex("tixff".getBytes());
        System.out.println(password);
    }
}
