package com.practice.app;

import com.practice.controller.SpringController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@EnableAutoConfiguration
//@ComponentScan("com.practice.controller")//扫描将controller所在的包告诉启动程序
//默认情况下扫描的是当前包及当前包的子包
@SpringBootApplication(scanBasePackages = {"com.practice.controller"})//组合注解,起到了上面两个注解的作用
public class SpringApplications {

    public static void main(String[] args){
        SpringApplication.run(SpringApplications.class,args);
    }
}
