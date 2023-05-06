package com.kojikoji.springframework.test;

import com.kojikoji.springframework.BeanDefinition;
import com.kojikoji.springframework.BeanFactory;
import com.kojikoji.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @ClassName ApiTest
 * @Description
 * @Author kojikoji 1310402980@qq.com
 * @Date 2023/5/6 15:05
 * @Version
 */

public class ApiTest {

    @Test
    public void test_BeanFactory(){
        // 1.初始化BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2.注入Bean
        BeanDefinition bean = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", bean);

        // 3.获取Bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
