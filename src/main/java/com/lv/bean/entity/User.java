package com.lv.bean.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Long Id;
    private String userName;
    private String password;
    private Date createDate;
    private String sts;
    private String stsDate;
    private String role;
}
