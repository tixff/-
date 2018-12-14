package com.ti.task_manager.controller;

import com.ti.task_manager.entities.User;
import com.ti.task_manager.jpa.UserRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author Ti
 * @date 2018/12/12
 */

@RestController
@RequestMapping("/jpa")
@Api(value = "jap测试", tags = "jap测试")
public class JapController {

    @Autowired
    private UserRepository repository;

    @ApiOperation(value = "查找用户",notes = "通过id查找")
    @GetMapping("find")
    public User findById(Integer id) {
        Optional<User> user = repository.findById(id);
        return user.get();
    }
}
