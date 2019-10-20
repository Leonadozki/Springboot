package com.leopro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class ApiController {

    @GetMapping("/apis")
    public String apiList(HttpSession session){
        session.setAttribute("username", username);
        return "/apis/list";
    }
}
