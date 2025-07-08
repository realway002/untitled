package com.lv.dao.mapper;

import com.lv.bean.entity.Person;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PersonMapper {
    int addPerson(Person person);
    int delPerson(Person person);
    int updatePerson(Person person);
    List<Person> selectPerson(Person person);
}
