package com.practice.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * EnableAutoConfiguration：启用自动配置，该注解会使SpringBoot根据项目依赖的jar包自动配置项目的配置项
 * 例如：我们添加了spring-boot-starter-web的依赖，项目中也就会引入SpringMVC的依赖，SpringBoot就会自动配置Tomcat和SpringMVC
 * exclude = {RedisAutoConfiguration.class}关闭自动配置
 */
@EnableAutoConfiguration(exclude = {RedisAutoConfiguration.class})
@Controller
public class IndexController {

    @RequestMapping("/")//工程访问路径
    @ResponseBody
    public String first(){
        return "Hello World!";
    }

    //入口，已经内置了tomcat，可以以web项目运行
    public static void main(String[] args){
        SpringApplication.run(IndexController.class,args);
    }
}
