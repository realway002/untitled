package com.lv;

import com.alibaba.excel.EasyExcel;
import com.lv.bean.entity.Student;
import com.lv.common.utils.CreateDataUtil;
import com.lv.handler.ContentStyleHandler;
import com.lv.handler.CustomSheetHandler;
import org.junit.Test;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AppTest {

    @Test
    public void test(){
        List<Integer> l1 = Arrays.asList(1,2,3,4,4,5);
        Set<Integer> s1 = l1.stream().filter(l -> l > 2).collect(Collectors.toSet());
        System.out.println(s1);
        s1.add(3);
        System.out.println(s1);
    }

    @Test
    public void simpleWrite(){
        String fileName ="";
        String path = System.getProperty("user.dir");
        String flowPath = String.format("%s%s%s",path,System.currentTimeMillis(),".xlsx");

        File file = new File(flowPath);
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParentFile());

        fileName =file.getName();
        EasyExcel.write(fileName, Student.class).registerWriteHandler(new CustomSheetHandler())
                .registerWriteHandler(new ContentStyleHandler())
                .sheet("模板").doWrite(CreateDataUtil.getData());

    }
}
