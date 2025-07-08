package com.lv.service.impl;

import com.lv.bean.entity.Person;
import com.lv.dao.mapper.PersonMapper;
import com.lv.service.IPersonQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonQueryImpl implements IPersonQuery {
    @Autowired
    private PersonMapper personMapper;
    @Override
    public List<Person> queryPersonInfo(Person person) {
        Person queryPerson = Optional.ofNullable(person).orElse(new Person());
        List<Person> people = personMapper.selectPerson(queryPerson);
        return people;
    }
}
