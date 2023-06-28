package com.lv.timeJob;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
public class LearnTimeJob {
    @Scheduled(fixedDelay = 1000)
    public void queueTask(){


    }
}
