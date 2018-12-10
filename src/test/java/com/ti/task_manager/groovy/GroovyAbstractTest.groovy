package com.ti.task_manager.groovy

import com.github.springtestdbunit.annotation.DbUnitConfiguration
import com.ti.task_manager.MyDbUnitTestExecutionListener
import com.ti.task_manager.TaskManagerApplication
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.TestExecutionListeners
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener
import org.springframework.test.context.support.DirtiesContextTestExecutionListener
import org.springframework.test.context.transaction.TransactionalTestExecutionListener
import org.springframework.test.context.web.WebAppConfiguration
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.web.context.WebApplicationContext
import spock.lang.Specification

@WebAppConfiguration
@AutoConfigureMockMvc
@ContextConfiguration
@TestExecutionListeners([
    DependencyInjectionTestExecutionListener.class,
    TransactionalTestExecutionListener.class,
    DirtiesContextTestExecutionListener.class,
    MyDbUnitTestExecutionListener.class
])
@DbUnitConfiguration(databaseConnection = "dataSource")
@SpringBootTest(classes=TaskManagerApplication.class)
abstract class GroovyAbstractTest extends Specification {
    def mockMvc
    @Autowired
    private WebApplicationContext webApplicationContext;

    def setup() {
        //获取mockmvc对象实例
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }
}
