package com.ti.task_manager.groovy

import com.github.springtestdbunit.annotation.DatabaseOperation
import com.github.springtestdbunit.annotation.DatabaseSetup
import com.ti.task_manager.entities.Manager
import com.ti.task_manager.mapper.ManagerMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.annotation.Rollback
import org.springframework.transaction.annotation.Transactional

class GroovyManagerTest extends GroovyAbstractTest {
    @Autowired
    private ManagerMapper managerMapper;

    def manager = new Manager()

    def "简单打印"() {
        println "hello groovy"
    }

    def setup() {
        manager.setId(81)
        manager.setName("大力水手")
        manager.setPassword("123456")
    }


    @DatabaseSetup(value = "classpath:data/manager.xml", type = DatabaseOperation.CLEAN_INSERT)
    @Transactional
    @Rollback
    def 添加管理员测试() {
        when:
        managerMapper.insert(manager)
        then:
        Manager m = managerMapper.selectByPrimaryKey(81)
        m != null
        "大力水手".equals(m.getName())
    }
}
