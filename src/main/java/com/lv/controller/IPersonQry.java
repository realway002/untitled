package com.lv.controller;

import com.lv.bean.entity.Person;

import java.util.List;

public interface IPersonQry {
    List<Person> getPersonInfo(Person person);
}
