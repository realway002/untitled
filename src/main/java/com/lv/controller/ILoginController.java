package com.lv.controller;

import com.lv.bean.User;
import com.lv.common.utils.GResponse;

import javax.servlet.http.HttpServletRequest;

public interface ILoginController {
    GResponse login(User user, HttpServletRequest req);
}
