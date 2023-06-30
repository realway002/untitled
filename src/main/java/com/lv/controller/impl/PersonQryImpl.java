package com.lv.controller.impl;

import com.lv.bean.Person;
import com.lv.controller.IPersonQry;
import com.lv.service.IPersonQuery;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
@Slf4j
public class PersonQryImpl implements IPersonQry {
    @Autowired
    private IPersonQuery personQuery;

    @PostMapping("/getPersonInfo")
    @ApiOperation(value = "获取信息")
    @ResponseBody
    @Override
    public List<Person> getPersonInfo(@RequestBody Person person) {
        log.info("入参为{}",person);
        List<Person> people = personQuery.queryPersonInfo(person);
        return people;
    }
}
