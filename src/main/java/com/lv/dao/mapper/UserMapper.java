package com.lv.dao.mapper;

import com.lv.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User selectUser(User user);
    void addUser(User user);
    void deleteUser(User user);
    void updateUserByName(User user);
}
