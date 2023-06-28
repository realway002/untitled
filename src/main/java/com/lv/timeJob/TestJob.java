package com.lv.timeJob;

import com.lv.bean.Person;
import com.lv.service.IAsyncTestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;

import javax.annotation.Resource;
import java.util.ArrayList;

@Slf4j
public class TestJob {
    @Resource
   private IAsyncTestService asyncTest;

//    @Async("testTaskExecutor")
//    @Scheduled(fixedDelay = 500)
    public void task1(){

    }
    @Async("woBackTaskExecutor")
    @Scheduled(fixedDelay = 2000)
    public void task2(){
        asyncTest.getData();
        ArrayList<Person> list = new ArrayList<>();
        Person p1 = new Person("lvmh", 99);
        Person p2 = new Person("jj", 1);
        Person p3 = new Person("qq", 2);
        Person p4 = new Person("rr", 10);
        Person p5 = new Person("ww", 44);
        for(int i=0;i<2;i++){
            list.add(p1);
            list.add(p2);
            list.add(p4);
            list.add(p3);
            list.add(p5);
        }
        list.stream().forEach(perSon -> {
            asyncTest.process(perSon);
        });
        log.info("处理成功1111111111");
    }

    @Scheduled(fixedDelay = 1000)
    public void task3(){
        log.info("task3333333");
    }
}
