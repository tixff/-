package com.ti.task_manager.service.impl;

import com.ti.task_manager.entities.Mission;
import com.ti.task_manager.mapper.MissionMapper;
import com.ti.task_manager.service.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Ti
 * @date 2018/12/4
 */
@Service
public class MissionServiceImpl implements MissionService {
    @Autowired
    private MissionMapper mapper;

    @Override
    public void addMission(Mission m) {
        mapper.insert(m);
    }
}
