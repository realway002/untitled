package com.lv.test;

import org.springframework.stereotype.Component;

@Component
public class testSpringBase {

    private String s1 = "s1";
    private final String s2 = "s2";

    private final static String s3 = "s3";

    public  static  class sClass1 {

    }

    private   class aClass1 {

    }

    public static void main(String[] args) {
        System.out.println("main");
    }


}
