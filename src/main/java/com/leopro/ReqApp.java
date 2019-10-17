package com.leopro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

/**
 *    标注一个类，声明为springboot应用
 * */
@SpringBootApplication
public class ReqApp {

    public static void main(String[] args) {

        SpringApplication.run(ReqApp.class, args);

    }
}
