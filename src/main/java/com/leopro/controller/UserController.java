package com.leopro.controller;

import com.leopro.Mapper.UserMapper;
import com.leopro.bean.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    UserMapper userMapper;

    /**
     *  通过名称查找用户数据
     */
    @GetMapping("/{name}")
    public User getByName(@PathVariable String name){
        User user = userMapper.getByName(name);
        return user;
    }
}
