package com.leopro.controller;

import com.leopro.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import javax.annotation.Resource;
import java.util.Map;

@Controller
public class ApiController {

    @Resource
    private Person person;

    @GetMapping("/apis")
    public String apiList(Map<String,Object> map){
        map.put("persons", person);
        return "/apis/list";
    }

    @GetMapping("/api")
    public String toAddPage(){
        // 跳转添加页面
        return "/apis/add";
    }

    @PostMapping("/apis")
    public String addApis(Person person){
        // 添加成功后重定向到列表页面
        System.out.println(person + "---post请求");
        return "redirect:/apis";
    }

    // 添加页面点击前往主页面
    @GetMapping("/dashboard")
    public String toMainPage(){
        return "redirect:/main";
    }

    @GetMapping("/api/{id}")
    public String toEditPage(@PathVariable("id") Integer id, Map<String,Object> map){
//        参数先注释，等完善dao方法
//        Person person = findPerson(id);
        System.out.println(id);
        map.put("person", person);
        return "/apis/edit";
    }

    // 提交编辑
    @PutMapping("/apis")
    public String updateApis(Person person){
        System.out.println(person + "---put请求");
        return "redirect:/apis";
    }
}
