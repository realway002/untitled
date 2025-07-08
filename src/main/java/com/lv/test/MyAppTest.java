package com.lv.test;


import com.alibaba.fastjson.JSONObject;
import com.lv.bean.entity.Person;
import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.util.Arrays;
import java.util.List;


//@SpringBootTest
public class MyAppTest {

    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    public void testMap(){
        String s1 = "hello";
        String s2 = "world";
        List<String> strings = Arrays.asList(s1, s2);
        strings.stream().map(s->{
            System.out.println(s);
            return s;
        }).forEach(m-> System.out.println(m));

    }

    @Test
    public void testReflect() throws ClassNotFoundException {
        Person perSon = new Person();
        Class perSonClass = perSon.getClass();
        Class<?> aClass = Class.forName("com.lv.bean.entity.Person");
        System.out.println("getClass:"+perSonClass.getName());
        System.out.println("Class.forName:"+aClass.getName());

    }

    @Test
    public void testJson() throws JSONException {
        ValueOperations ops = redisTemplate.opsForValue();
        ops.set("name","lvmh");
        ops.set("age",11);
    }

    @Test
    public void getRedis(){
        ValueOperations ops = redisTemplate.opsForValue();
        System.out.println(ops.get("name"+"11111111"));
        System.out.println(ops.get("age"+"11111111"));
    }

    @Test
    public void test11(){
        String s1 = "55485|1111";
        String s2 = "15615";

        String[] split = s1.split("\\|");
        System.out.println(JSONObject.toJSONString(s1.split("\\|")));
        System.out.println(JSONObject.toJSONString(s2.split("\\|")));
    }
}
