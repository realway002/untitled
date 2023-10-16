package com.lv.service;

import com.lv.bean.ParamInfo;
import com.lv.enumUtil.EnumParamInfo;
import com.lv.service.impl.AsyncTestService;
import com.lv.util.ParamInfoUtils;
import lombok.extern.slf4j.Slf4j;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;
import java.util.stream.Collectors;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyAppTest {

//    @Autowired
//    private AsyncTestService asyncTestService;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Test
    public void test1(){
        List<String> receivers = new ArrayList<>();
        receivers.add("111");
        receivers.add("2222");
        receivers.add("333");
//        System.out.println(receivers);
        List<ParamInfo> paramInfos = receivers.stream().map(mapper -> new ParamInfo(EnumParamInfo.P_STAFF.name(), mapper)).collect(Collectors.toList());
        ParamInfo paramInfo = new ParamInfo(EnumParamInfo.P_GROUP.name(), "999");
        paramInfos.add(paramInfo);
        Optional<ParamInfo> paramInfoByKey = ParamInfoUtils.getParamInfoByKey(paramInfos, EnumParamInfo.P_STAFF.name());
        log.info("接收人是{}",paramInfoByKey);
    }
    @Test
    public void test2() throws Exception{
//        asyncTestService.doTaskOne();
//        asyncTestService.doTaskTwo();
//        asyncTestService.doTaskThree();
        String key = "route";
        String[] keys = key.split(",");
        Set<String> params = new HashSet<>();
        params.add("SIGN_COM_TYPE");
        params.add("P_STAFF");
        params.add("CREATE_LOGIN");
        params.add("route");
        params.add("SYSFLOW_ID");
        for (String sKey : keys) {
            if (!params.contains(sKey)) {
                System.out.println("false");
                //throw new BusiException(ErrorConst.E100002, "路由计算入参参数未传入" + sKey);
            }
            System.out.println("true");
        }

    }

    @Test
    public void test3(){
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from person;");
        for (Map<String, Object> map : list) {
            System.out.println(map);
        }
    }
}
