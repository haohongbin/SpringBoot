package com.practice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@EnableAutoConfiguration
@Controller
public class BookController {
    //使用@Value("${book.author}"获取自定义属性的值
    @Value("${book.author}")//book.author这个名字与全局配置文件中的名字要一致
    private String author;

    @Value("${book.name}")
    private String name;

    @RequestMapping("/bookInfo")
    @ResponseBody
    public String showInfo(){
        return author+":"+name;
    }

    public static void main(String[] args){
        SpringApplication.run(BookController.class,args);
    }
}
