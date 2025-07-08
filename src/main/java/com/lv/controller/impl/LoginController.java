package com.lv.controller.impl;

import com.lv.bean.entity.User;
import com.lv.common.utils.GResponse;
import com.lv.common.utils.TokenUtils;
import com.lv.controller.ILoginController;
import com.lv.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

@RestController
@RequestMapping("/api")
public class LoginController implements ILoginController {
    @Autowired
    private ILoginService loginService;
    @Override
    @PostMapping("/login")
    public GResponse login(@RequestBody User user, HttpServletRequest req) {
//        System.out.println();
        User loginInfo = loginService.getLoginInfo(user);
        if(null== loginInfo){
            return GResponse.fail("用户名或密码错误");
        }else {
            String token = TokenUtils.sign(user);
            HashMap<String,Object> hs=new HashMap<>();
            hs.put("token","token"+user.getUserName()+user.getPassword());

            return GResponse.success(loginInfo,token);
        }
    }
}
