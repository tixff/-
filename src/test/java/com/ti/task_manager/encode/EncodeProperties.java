package com.ti.task_manager.encode;

import com.ti.task_manager.AbstractTest;
import org.jasypt.encryption.StringEncryptor;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author Ti
 * @date 2018/12/13
 */
@WebAppConfiguration
public class EncodeProperties extends AbstractTest {
    @Autowired
    StringEncryptor encryptor;

    @Test
    public void getPass() {
        String username = encryptor.encrypt("22@qq.com");
        String password = encryptor.encrypt("password");
        System.out.println(username + "----------------");
        System.out.println(password + "----------------");
        Assert.assertTrue(username.length() > 0);
        Assert.assertTrue(password.length() > 0);
    }
}
