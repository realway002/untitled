package com.lv.service;

import com.lv.bean.Person;

import java.util.List;

public interface IPersonQuery {
    List<Person> queryPersonInfo(Person person);
}
