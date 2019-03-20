package com.practice.test;

import com.practice.controller.SpringController;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

//指名要测试的类
@SpringBootTest(classes = SpringController.class)
//指名进行测试的类
@RunWith(SpringJUnit4ClassRunner.class)
//与web的整合
@WebAppConfiguration
public class TestSpringController {
    //注入
    @Autowired
    private SpringController springController;
    @Test
    public void test1(){
        TestCase.assertEquals(this.springController.yes(),"hello");
    }

}
