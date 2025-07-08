package com.lv.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "file.accept")
@Data
public class FileActConfig {

    private String rootPath;

}
