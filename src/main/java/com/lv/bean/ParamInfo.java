package com.lv.bean;

import lombok.Data;

@Data
public class ParamInfo {
    private String attrCode;
    private String attrValue;

    public ParamInfo(String attrCode,String attrValue){
        this.attrCode = attrCode;
        this.attrValue = attrValue;
    }
}
