package com.leopro.config;

import com.leopro.component.LoginHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 *  SpringMvc配置类
 * */
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    // 注册视图控制器
    public void addViewControllers(ViewControllerRegistry registry){
        //   redirect路径转发到success.html
        registry.addViewController("/redirect").setViewName("success");
        registry.addViewController("/main").setViewName("dashboard");
    }

    // 注册拦截器
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/", "/index", "/asserts/**",
                        "/login", "/webjars/**", "/user/login", "/css/**");
    }

    // 注册资源处理器，去掉页面的静态资源拦截
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 静态文件
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        // webjar文件
        registry.addResourceHandler("/webjars/**").addResourceLocations("/webjars/");
    }

}
