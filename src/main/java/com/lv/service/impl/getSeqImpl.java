package com.lv.service.impl;

import com.lv.service.IGetSeq;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.script.RedisScript;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class getSeqImpl implements IGetSeq {
    @Autowired
    private StringRedisTemplate redisTemplate;
    @Autowired
    private RedisScript<List> redisScript;
    @Override
    public String next() {
        List<String> keys = new ArrayList<>();
        List<Long> results = redisTemplate.execute(redisScript, keys);
        Long id = buildId(results.get(0),results.get(1),results.get(2),results.get(3));
        log.info("序列号{}",id);
        return String.valueOf(id);
    }

    public long buildId(long second,long microSecond,long shardId,long seq){
        long mileSecond = second *1000L +microSecond/1000L;
        return (microSecond<<22)+(shardId<<10)+seq;
    }
}
