package com.lv.controller.impl;

import com.lv.bean.Person;
import com.lv.controller.IPersonQry;
import com.lv.service.IPersonQuery;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Controller
public class PersonQryImpl implements IPersonQry {
    private IPersonQuery personQuery;

    @PostMapping("/getPersonInfo")
    @Override
    public List<Person> getPersonInfo(@RequestBody Person person) {
        List<Person> people = personQuery.queryPersonInfo(person);
        return people;
    }
}
