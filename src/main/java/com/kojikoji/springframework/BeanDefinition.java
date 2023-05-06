package com.kojikoji.springframework;

/**
 * @ClassName BeanDefination
 * @Description 定义Bean
 * @Author kojikoji 1310402980@qq.com
 * @Date 2023/5/6 14:56
 * @Version
 */

public class BeanDefinition {

    private Object object;

    public BeanDefinition(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }
}
