package com.lv.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.util.ListUtils;
import com.alibaba.fastjson.JSON;
import com.lv.bean.entity.Student;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @Author lvmh
 * @Date 2023/9/1 10:52
 * @PackageName:listener
 * @ClassName: studentListener
 * @Description: TODO
 * @Version 1.0
 */
@Slf4j
public class StudentListener implements ReadListener<Student> {

    private static final int BATCH_COUNT=100;
    private List<Student> cachedDataList = ListUtils.newArrayListWithExpectedSize(BATCH_COUNT);

    private Student student;
    private StudentListener(){
        student = new Student();
    };
    private StudentListener(Student student){
        this.student = student;
    }

    @Override
    public void invoke(Student student, AnalysisContext analysisContext) {
        log.info("解析了一条数据{}", JSON.toJSONString(student));
        cachedDataList.add(student);
        if(cachedDataList.size()>=BATCH_COUNT){
            saveData();
            cachedDataList = ListUtils.newArrayListWithExpectedSize(BATCH_COUNT);
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        saveData();
        log.info("所有数据解析完成！");

    }
    private void saveData(){
//        log.info("{}条数据，开始存储数据库！", cachedDataList.size());
//        demoDAO.save(cachedDataList);
//        log.info("存储数据库成功！");
    }
}
