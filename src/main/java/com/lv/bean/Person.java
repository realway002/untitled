package com.lv.bean;

import lombok.Data;

@Data
public class Person {
    private Long idCard;
    private String name;
    private String sex;
    private Integer age;


    public Person(){

    };
    public Person(String name, Integer age){
        this.name = name;
        this.age = age;
    }
    public Person(String name,String sex, Integer age){
        this.name = name;
        this.age = age;
        this.sex =sex;
    }

}
