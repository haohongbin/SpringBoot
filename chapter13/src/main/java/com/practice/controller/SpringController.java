package com.practice.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController//如果每个功能返回的都是Restful内容，那么可以使用该注解，就不需要每个功能上都使用@ResponseBody
public class SpringController {
    @RequestMapping("/hello")
    //@ResponseBody返回的是Restful内容，不使用该注解会进行跳转
//    @ResponseBody
    public String yes(){
        return "hello";
    }

    @RequestMapping("/ok")
//    @ResponseBody
    public String ok(){
        return  "ok";
    }
    //支持Rest风格
    @RequestMapping("/info/{msg}")
    public String show(@PathVariable String msg){//@PathVariable把接收到的msg赋给show方法
        return  "show"+msg;
    }


}
