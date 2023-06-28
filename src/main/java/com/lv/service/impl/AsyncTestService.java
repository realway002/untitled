package com.lv.service.impl;

import com.lv.bean.Person;
import com.lv.service.IAsyncTestService;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.DateUtil;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Future;

@Slf4j
@Service
public class AsyncTestService implements IAsyncTestService {
    private int a = 0;

    @Override
//    @Async("woBackTaskExecutor")
    public void process(Person p) {
        try {
            Thread.sleep(500);
            if("lvmh".equals(p.getName())){
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Date now = DateUtil.now();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:MM:ss");
        String date = simpleDateFormat.format(now);
        log.info("处理器{}在{}------------处理了{}",Thread.currentThread().getName(),date,p.getName());

    }

    @Override
    @Async("dealNumsExecutor")
    public Future<String> process0() {

        try {
            Thread.sleep(5000);
            log.info("处理器{}",Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new AsyncResult<>("nn");
    }

    @Override
    public String getData() {
        log.info(Thread.currentThread().getName()+"获取数据{}","AAAAAAAAA");
        return "success";
    }


    public void doTaskOne() throws Exception {
        log.info("开始任务一");
        long start = System.currentTimeMillis();
        Thread.sleep(5000);
        long end = System.currentTimeMillis();
        log.info("完成任务一，耗时{}",end-start);
    }
    public void doTaskTwo() throws Exception {
        log.info("开始任务二");
        long start = System.currentTimeMillis();
        Thread.sleep(6000);
        long end = System.currentTimeMillis();
        log.info("完成任务二，耗时{}",end-start);
    }
    public void doTaskThree() throws Exception {
        log.info("开始任务一");
        long start = System.currentTimeMillis();
        Thread.sleep(9000);
        long end = System.currentTimeMillis();
        log.info("完成任务二，耗时{}",end-start);
    }
}
