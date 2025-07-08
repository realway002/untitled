package com.lv.service.file;

import com.alibaba.fastjson.JSONObject;
import com.lv.config.FileActConfig;
import com.lv.common.utils.DateUtils;
import com.lv.common.utils.project.DateConst;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@Slf4j
@RequestMapping("/com/lv/file/act")
public class FileActImpl implements IFileAct {
    @Resource
    private FileActConfig fileActConfig;
    @Resource
    private Environment env;
    @Override
    public void exportFile(MultipartFile file) {

    }

    @Override
    @PostMapping("uploadFile")
    public void uploadFile(@RequestParam("file") MultipartFile file, HttpServletRequest httpServletRequest) {
        //上传文件
        //配置将要输入的文件地址
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //文件的最终路径
            String lastPath = "";
            String uploadRootPath = fileActConfig.getRootPath();
            String outPutPath = env.getProperty("file.upload.path");
            //如果配置文件路径不存在，报错
            //获取文件输入流
            InputStream is = file.getInputStream();
            log.info("文件属性{}", JSONObject.toJSONString(file));
            String originalFilename = file.getOriginalFilename();
            // 获取最终路径
            //最终路径，按照根路径下，yyyyMMDD日期分割
            Date now = DateUtils.getDate();
            String yyyyMMHH = DateUtils.getFormatDate(now, DateConst.DATE_FORMAT_2);
            String dateFormat2 = DateConst.DATE_FORMAT_2;
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat2);
            String format = simpleDateFormat.format(date);
            lastPath = outPutPath + System.currentTimeMillis() +  originalFilename;
            String name = file.getName();
            //使用缓冲流
            bis = new BufferedInputStream(is);
            //新建输出流
            bos = new BufferedOutputStream(new FileOutputStream(lastPath));
            byte[] bytes = new byte[1024];
            int b;
            while ( (b = bis.read(bytes)) != -1){
                bos.write(bytes,0,b);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if( null != bis){
                    bis.close();
                }
                if( null != bos){
                    bos.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        //使用



    }

    private void saveFile(String path, Byte [] data){
        File file = new File(path);
    }

    public static void main(String[] args) {
        String s1 = "J0091,J00941,J0991,J0181,J0090,J122001,J122002,J122003,J122006,J122004,J122005,J0238,J0239,J2311,J2314,J0010,J2088,J2291,J2292,J2293,J0180,J0280,J0290,J1000,J2000";

    }
}
