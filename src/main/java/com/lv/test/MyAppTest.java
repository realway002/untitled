package com.lv.test;


import com.lv.bean.Person;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


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
        Class<?> aClass = Class.forName("com.lv.bean.Person");
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
        String s = "18.24";
        String s1 = "11";
        int i = s.indexOf(".");
        s= s.substring(0,s.indexOf("."));
//        s1= s1.substring(0,s1.indexOf("."));
//        String substring = s.substring(0, i);
        System.out.println(i);
//        System.out.println(s.split("."));
//        s = s.split(".")[0];
//        System.out.println(Integer.valueOf(s));
//        List<Long> a = new ArrayList<>();
//        a.add(1L);
//        List<Long> b = new ArrayList<>();
//        b.add(1L);
//        b.add(2L);
//        b.add(3L);
//        boolean contains = a.contains(1L);
//        System.out.println(contains);
//        List<Long> collect1 = b.stream().filter(id -> !a.contains(id))
//                .map(s->{
//                    System.out.println(s);
//                    return s;
//                })
//                .collect(Collectors.toList());
//        List<Long> collect = b.stream().collect(Collectors.toList());
//
//        System.out.println(collect1);
//        System.out.println(collect);
    }
}
