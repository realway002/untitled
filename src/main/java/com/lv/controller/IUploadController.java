package com.lv.controller;

import org.springframework.web.multipart.MultipartFile;

public interface IUploadController {
    String uploadFile(MultipartFile file);
}
