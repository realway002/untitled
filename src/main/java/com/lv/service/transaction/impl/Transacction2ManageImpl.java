package com.lv.service.transaction.impl;

import com.lv.service.transaction.TransactionManage;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionDefinition;


@Component
public class Transacction2ManageImpl implements TransactionManage {
    @Override
    public void testTransaction() {
        System.out.println("输出结果，test2");
    }
}
