package com.lv.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.lv.bean.User;
import com.lv.dao.mapper.UserMapper;
import com.lv.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService implements ILoginService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getLoginInfo(User user) {
//        Optional.ofNullable(user).orElseThrow()
        String userName = user.getUserName();
        String password = user.getPassword();
        if(StringUtils.isEmpty(userName)||StringUtils.isEmpty(password)){
            return null;
        }
        user.setSts("Y");
        User userInfo = userMapper.selectUser(user);
        return userInfo;
    }
}
