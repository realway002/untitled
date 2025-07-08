package com.lv.service.impl;

import com.lv.bean.entity.Person;
import com.lv.dao.mapper.PersonMapper;
import com.lv.service.IPersonDealService;
import com.lv.service.IPersonQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Optional;

@Service
public class PersonDealService implements IPersonDealService {
    @Autowired
    private IPersonQuery personQuery;
    @Autowired
    private PersonMapper personMapper;

    @Override
    public void addPersonSvc(Person person) {
        Long idCard = Optional.ofNullable(person).map(Person::getIdCard).orElse(null);
        Assert.notNull(idCard,"添加人员时，身份证号不能为空");
        Person p = new Person();
        p.setIdCard(idCard);
        List<Person> personList = personQuery.queryPersonInfo(p);
        if(!CollectionUtils.isEmpty(personList)){
            return;
        }
        personMapper.addPerson(person);
    }

    @Override
    public void delPersonSvc(Person person) {

    }
}
