package com.practice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@EnableAutoConfiguration
@Controller
@ConfigurationProperties(prefix = "book")
public class BookController2 {

    private String author;
    private String name;

    @RequestMapping("/bookInfo")
    @ResponseBody
    public String showInfo(){
        return author+":"+name;
    }

    public static void main(String[] args){
        SpringApplication.run(BookController2.class,args);
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }
}
