package com.leopro.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@ConfigurationProperties(prefix = "person") // 属性跟配置文件中属性做绑定, prefix为绑定配置文件中哪个属性
public class Person {
    private Integer id;
    private String name;
    private Integer age;
    private String job;
    private Integer status;
    private List<String> habit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<String> getHabit() {
        return habit;
    }

    public void setHabit(List<String> habit) {
        this.habit = habit;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", status=" + status +
                ", habit=" + habit +
                '}';
    }
}
