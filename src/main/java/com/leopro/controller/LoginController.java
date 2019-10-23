package com.leopro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    // restful风格mapping
    @PostMapping(value = "/user/login")
    public String loginAction(@RequestParam("username") String username,
                              @RequestParam("password") String password,
                              Map<String,Object> map, HttpSession session){
        if(!StringUtils.isEmpty(username) && password.equals("1111")){
            // 登陆成功，设置session属性，给登陆拦截器判断
            session.setAttribute("username", username);
            // 登陆成功，防止重复提交，重定向路径
            return "redirect:/main";
        }else{
            map.put("msg", "登录失败");
            return "login";
        }
    }
}
