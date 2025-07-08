package com.lv.controller.impl;

import com.lv.bean.entity.Person;
import com.lv.controller.IPersonDeal;
import com.lv.service.IPersonDealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class PersonDealImpl implements IPersonDeal {
    @Autowired
    private IPersonDealService personDealService;
    @Override
    @PostMapping("/addPerson")
    public void addPerson(@RequestBody Person person) {
        personDealService.addPersonSvc(person);
    }

    @Override
    public void delPerson(Long idCard) {

    }
}
