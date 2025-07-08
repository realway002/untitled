package com.lv.controller.impl;

import com.lv.controller.IUploadController;
import com.lv.service.IUpLoadFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/lv/api/file")
public class UploadControllerimpl implements IUploadController {
    @Autowired
    private IUpLoadFile upLoadFile;

    @Override
    @PostMapping("/uploadFile")
    public String uploadFile(@RequestBody MultipartFile file) {
        upLoadFile.uploadFile(file);
        return null;
    }
}
