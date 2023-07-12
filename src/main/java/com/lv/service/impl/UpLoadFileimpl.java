package com.lv.service.impl;

import com.lv.service.IUpLoadFile;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Slf4j
@Service
public class UpLoadFileimpl implements IUpLoadFile {

    @Value("${file.upload.path}")
    private String filePath;


    @Override
    public String uploadFile(MultipartFile file) {
//        String filePath = "upload";
        String originalFilename = file.getOriginalFilename();
        Long size = file.getSize();
        File file1 = new File(filePath + "\\" + originalFilename);
        if(!file1.getParentFile().exists()){

        }
        log.info("文件的初始名称{}",filePath);


        return null;
    }
}
