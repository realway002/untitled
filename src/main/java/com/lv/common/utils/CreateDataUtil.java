package com.lv.common.utils;

import com.alibaba.excel.util.ListUtils;
import com.lv.bean.Student;
import org.apache.poi.ss.formula.functions.T;

import java.util.List;

/**
 * @Author lvmh
 * @Date 2023/9/1 11:49
 * @PackageName:com.lv.common.utils
 * @ClassName: CreateDataUtil
 * @Description: TODO
 * @Version 1.0
 */
public class CreateDataUtil {
    public static List<Student> getData(){
        List<Student> data = ListUtils.newArrayList();
        for(int i=0;i<10;i++){
            Student student = new Student();
            student.setId("id"+i);
            student.setAge(i);
            student.setName("name"+i);
            student.setSex("1");
            data.add(student);
        }
        return data;
    }
}
