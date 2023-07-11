package com.lv.test;


import com.lv.bean.Person;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MyTest {
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
        JSONObject jsonObject = new JSONObject("{\"ROOT\":{\"BODY\":{\"BUSI_INFO\":{\"pageSize\":10,\"pageNum\":1,\"condType\":null,\"condID\":null},\"OPR_INFO\":{\"loginNo\":\"gztest\"}}}}");
        System.out.println(jsonObject.getInt("pageSize"));

    }
}
