package com.leopro.config;

import org.springframework.context.annotation.Configuration;

/**
 *  Spring配置类
 * */
@Configuration
public class SpringConfiguration {

    public SpringConfiguration(){
        System.out.println("Ioc 容器启动成功...");
    }

}
