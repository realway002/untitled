package com.lv.controller;

import com.lv.service.transaction.TransactionManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

//    @Autowired
    @Qualifier("Transacction2ManageImpl")
    private TransactionManage transactionManage;

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        transactionManage.testTransaction();
        return "Hello World!";
    }
}
