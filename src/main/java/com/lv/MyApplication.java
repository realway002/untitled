package com.lv;

import com.lv.timeJob.LearnTimeJob;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@MapperScan("com.lv.dao.mapper")
//@ComponentScan()
@EnableAsync
//@EnableConfigurationProperties(LearnTimeJob.class)
public class MyApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ap = new ClassPathXmlApplicationContext("appXml2.xml");
        String[] beanDefinitionNames = ap.getBeanDefinitionNames();
        for(String s1:beanDefinitionNames){
            System.out.println(s1);
        }
//        SpringApplication.run(MyApplication.class,args);
    }
}
