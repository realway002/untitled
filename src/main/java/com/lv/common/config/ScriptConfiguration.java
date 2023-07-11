package com.lv.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.data.redis.core.script.RedisScript;
import org.springframework.scripting.support.ResourceScriptSource;

import java.util.List;

@Configuration
public class ScriptConfiguration {

    @Bean
    public RedisScript<List> redisScript(){
        Resource  resource= new ResourceScriptSource(new ClassPathResource("redis-script-single.lua")).getResource();
        return RedisScript.of(resource,List.class);
    }
}
