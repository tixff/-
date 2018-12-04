package com.ti.task_manager.controller;

import com.ti.task_manager.entities.Mission;
import com.ti.task_manager.service.MissionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ti
 * @date 2018/12/4
 */
@RestController
@RequestMapping("/mission")
@Api(value = "任务操作", tags = "任务操作")
public class MissionController {
    @Autowired
    private MissionService service;

    @PostMapping("add")
    @ApiOperation(value = "添加任务", notes = "添加任务")
    public void addMission(Mission mission) {
        service.addMission(mission);
    }
}
