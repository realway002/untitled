package com.lv.bean.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Document {
    private String docId;
    private String relId;
    private String uId;
    private String fileName;
    private String type;
    private String path;
    private Long size;
    private Date createDate;
    private Date updateDate;
}
