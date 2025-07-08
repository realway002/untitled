package com.lv.uitls;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description: TODO
 * @author 日期类工具
 * @date 2025/7/4 下午4:00
 * @version 1.0
 */
public class DateUtils {

    /**
     * @description:  生成日期
     * @param:
     * @return: java.util.Date
     * @author lvmh
     * @date: 2025/7/4 下午4:01
     */
    public static Date getDate(){
        return new Date();
    }


    public static String getFormatDate(Date date, String format) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(date);
    }

}
