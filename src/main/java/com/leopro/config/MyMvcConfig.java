package com.leopro.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 *  SpringMvc配置类
 * */
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    //   redirect路径转发到success.html
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/redirect").setViewName("success");
    }
}
