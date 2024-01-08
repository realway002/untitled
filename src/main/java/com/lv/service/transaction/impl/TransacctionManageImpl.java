package com.lv.service.transaction.impl;

import com.lv.bean.sitech.OsMsgAlarmInst;
import com.lv.dao.mapper.OsMsgAlarmInstMapper;
import com.lv.service.transaction.TransactionManage;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionTemplate;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class TransacctionManageImpl implements TransactionManage {


    @Autowired
    private TransactionTemplate transactionTemplate;
    @Resource
    private OsMsgAlarmInstMapper osMsgAlarmInstMapper;


    @Override
    public void testTransaction() {
//        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = "2024-11-01 12:00:00";
        Date formatDate = null;
        try {
            formatDate = simpleDateFormat.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        OsMsgAlarmInst osMsgAlarmInst = new OsMsgAlarmInst();
        osMsgAlarmInst.setMsgAlarmInstId(20231228999001L);
        osMsgAlarmInst.setNote("1111");
        osMsgAlarmInst.setBusiOrderNo("Gz16516510562");
        osMsgAlarmInst.setCreateDate(formatDate);
        osMsgAlarmInst.setSendDate(formatDate);
        osMsgAlarmInst.setBusiType("1");
        osMsgAlarmInst.setServNumber("489645611851");
        osMsgAlarmInst.setServLoginNo("gztest");

        osMsgAlarmInstMapper.insert(osMsgAlarmInst);
        System.out.println("输出结果，test1");

    }
}
