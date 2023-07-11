package com.lv.controller.impl;

import com.lv.controller.IGetSeqController;
import com.lv.service.IGetSeq;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class GetSeqConImpl implements IGetSeqController {
    @Autowired
    private IGetSeq getSeq;


    @Override
    @GetMapping("/getId")
    public String getId() {
        String id = getSeq.next();
        log.info("生成序列号{}",id);
        return id;
    }
}
