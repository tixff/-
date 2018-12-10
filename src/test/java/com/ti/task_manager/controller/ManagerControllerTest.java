package com.ti.task_manager.controller;

import com.github.springtestdbunit.annotation.DatabaseOperation;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

public class ManagerControllerTest extends AbstractControllerTest {

    @Test
    @DatabaseSetup(value = "classpath:data/manager.xml", type = DatabaseOperation.CLEAN_INSERT)
    @Transactional
    @Rollback
    public void addManager() throws Exception {
        mockMvc.perform(post("/manager/add")
                .param("id", "1101").param("name", "小马"));
        mockMvc.perform(get("/manager/find")
                .param("id", "1101"))
                .andExpect(jsonPath("$.data.manager.name").value("小马"));
    }
}