package com.lv.service;

import org.springframework.web.multipart.MultipartFile;

public interface IUpLoadFile {
    String uploadFile(MultipartFile file);
}
