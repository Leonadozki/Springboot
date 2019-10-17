package com.leopro.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 *  Spring配置类
 * */
@Configuration
public class SpringConfiguration {

    public SpringConfiguration(){
        System.out.println("Ioc 容器启动成功...");
    }

}
