package com.lv.bean.file;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lvmh
 * @version 1.0
 * @description: TODO
 * @date 2024/9/27 17:15
 */
@Data
@Builder

public class FileInfo {
    private String fileName;
    private String savePath;
    private Long uid;
    private Integer fileSize;
    private String fileType;
    private String fileTypeName;

}
