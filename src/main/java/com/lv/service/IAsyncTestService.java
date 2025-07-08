package com.lv.service;

import com.lv.bean.entity.Person;

import java.util.concurrent.Future;

public interface IAsyncTestService {

    void process(Person p);
    Future<String> process0();
    String getData();

}
