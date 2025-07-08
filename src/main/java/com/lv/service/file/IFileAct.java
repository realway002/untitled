package com.lv.service.file;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

public interface IFileAct {

    void exportFile(MultipartFile file);

    void uploadFile(MultipartFile file, HttpServletRequest httpServletRequest);
}
