package com.lv.bean;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ContentStyle;
import com.alibaba.excel.enums.BooleanEnum;
import lombok.Data;

/**
 * @Author lvmh
 * @Date 2023/9/1 10:50
 * @PackageName:com.lv.bean
 * @ClassName: Student
 * @Description: TODO
 * @Version 1.0
 */
@Data
public class Student {
    @ExcelProperty("编号")
    private String id;
    @ExcelProperty("姓名")
    private String name;
    @ExcelProperty("年龄")
    private Integer age;
    @ExcelProperty("性别")
    private String sex;
}
