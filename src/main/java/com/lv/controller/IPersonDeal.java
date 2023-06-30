package com.lv.controller;

import com.lv.bean.Person;

public interface IPersonDeal {
    void addPerson(Person person);
    void delPerson(Long idCard);
}
