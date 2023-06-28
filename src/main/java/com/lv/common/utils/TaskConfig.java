package com.lv.common.utils;

import com.lv.timeJob.TestJob;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

@Configuration
public class TaskConfig {


    @Bean("testTaskExecutor")
    public ThreadPoolTaskExecutor  testTaskExecutor(){
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(50);
        executor.setMaxPoolSize(60);
        executor.setQueueCapacity(100);
        executor.setThreadNamePrefix("lvmh-");
        executor.initialize();
        return executor;
    }

    @Bean("woBackTaskExecutor")
    public ThreadPoolTaskExecutor woBackTaskExecutor() {
        ThreadPoolTaskExecutor executor= new ThreadPoolTaskExecutor();
        executor.setThreadNamePrefix("woBackTaskExecutor-");
        executor.setCorePoolSize(50);
        executor.setMaxPoolSize(80);
//        executor.setWaitForTasksToCompleteOnShutdown(true);
//        executor.setAwaitTerminationSeconds(60);
        executor.setQueueCapacity(100);
        executor.initialize();
        return executor;
    }

    @Bean("dealNumsExecutor")
    public ThreadPoolTaskExecutor dealNumsExecutor(){
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(20);
        executor.setMaxPoolSize(30);
        executor.setQueueCapacity(50);
        executor.setThreadNamePrefix("lllllllll");
        executor.initialize();
        return executor;
    }
    @ConditionalOnProperty(prefix = "lvmh.test",name = "testJob",havingValue = "true")
    @Bean
    public TestJob Job(){
        TestJob testJob = new TestJob();
        return testJob;
    }
}
