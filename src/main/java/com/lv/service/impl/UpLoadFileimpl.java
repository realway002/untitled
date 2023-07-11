package com.lv.service.impl;

import com.lv.service.IUpLoadFile;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.multipart.MultipartFile;

public class UpLoadFileimpl implements IUpLoadFile {

    @Value("${file.upload.path}")
    private String filePath;


    @Override
    public String uploadFile(MultipartFile file) {
//        String filePath = "upload";
        String originalFilename = file.getOriginalFilename();
        Long size = file.getSize();

        return null;
    }
}
