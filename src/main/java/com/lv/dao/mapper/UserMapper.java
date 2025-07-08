package com.lv.dao.mapper;

import com.lv.bean.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User selectUser(User user);
    void addUser(User user);
    void deleteUser(User user);
    void updateUserByName(User user);
}
