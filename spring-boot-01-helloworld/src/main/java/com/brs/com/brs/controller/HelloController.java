package com.brs.com.brs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller//处理请求
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String Hello() {
        return "hello World";
    }
}
