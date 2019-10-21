package com.leopro.controller;

import com.leopro.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
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
}
