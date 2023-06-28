package com.lv.service;

import com.lv.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ConfigurationA {
    @Autowired
    private Person perSon;

    public static void main(String[] args) {

    }

    @Test
    public void personTest(){
        System.out.println(perSon);
    }
}
