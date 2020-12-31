package com.example.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//处理http请求
@RestController
public class GirlController {
    //自动装配bean的类型
    @Autowired
    private GirlRepository girls2;
    @Autowired
    private GirlService girlService;

    @GetMapping("/girls")
    public List<Girl> girlList() {
        return girls2.findAll();
    }

}
