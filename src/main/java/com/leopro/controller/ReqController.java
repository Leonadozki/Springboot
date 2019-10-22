package com.leopro.controller;


import com.leopro.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

//@ResponseBody     方法返回内容作为body返回
//@RestController     // 集合了@ResponseBody和@Controller的写法
@Controller
public class ReqController {

    @Resource
    private Person person;

    @ResponseBody
    @RequestMapping("/hello")
    public String requestTest(){
        return "<h1>Congratulations ! This is ur response content!</h1>\n"+person;
    }

    @RequestMapping({"/", "/index"})
    public String index(){
        return "index";
    }

    // 返回成功模板页面
    @RequestMapping("/suc")
    public String successPage(){
        return "success";
    }

    @RequestMapping("/login")
    public String loginPage(){
        return "login";
    }
}
