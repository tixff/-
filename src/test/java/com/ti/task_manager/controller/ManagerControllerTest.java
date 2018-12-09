package com.ti.task_manager.controller;

import com.github.springtestdbunit.annotation.DatabaseOperation;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

public class ManagerControllerTest extends AbstractControllerTest {

    private MockMvc mockMvc;
    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setUp() {
        //获取mockmvc对象实例
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

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