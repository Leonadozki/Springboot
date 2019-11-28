package com.leopro;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 *    标注一个类，声明为springboot应用
 * */
@SpringBootApplication
public class ReqApp {

    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger(ReqApp.class);

        logger.info("springboot启动类加载...");

        SpringApplication.run(ReqApp.class, args);

    }
}
