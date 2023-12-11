package com.lv.util;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.VelocityTemplateEngine;

/**
 * @Author lvmh
 * @Date 2023/10/11 11:51
 * @ClassName: MybatisPlusGenerator
 */
public class MybatisPlusGenerator {
    public static void main(String[] args) {


            // ================= 需要修改的配置 =================

            // 数据源配置
            String jdbcUrl = "jdbc:mysql://172.18.196.229:8880/oscomadm";
            String jdbcDriver = "com.mysql.cj.jdbc.Driver";
            String jdbcUsername = "oscomadmopr";
            String jdbcPassword = "oscomadmopr1@3$";

            // 父级包名配置
            String parentPackage = "com.lv";

            // 生成代码的 @author 值
            String author = "lvmh";

            // 要生成代码的表名配置
            String[] tables = {
                    "os_brm_step_info",//xxx表

            };

            // ==================================================


            AutoGenerator mpg = new AutoGenerator();
            // 全局配置
            GlobalConfig gc = new GlobalConfig();
            String projectPath = System.getProperty("user.dir");
            gc.setOutputDir(projectPath + "\\src\\main\\java");
            gc.setAuthor(author);
            gc.setSwagger2(true);
            gc.setBaseResultMap(true);
            gc.setBaseColumnList(true);
            // 生成完毕后是否打开输出目录
            gc.setOpen(false);
            // 为true时生成entity将继承Model类，单类即可完成基于单表的业务逻辑操作，按需开启
            gc.setActiveRecord(false);
            gc.setFileOverride(true);
            gc.setControllerName("%sController");
            gc.setServiceName("%sService");
            gc.setServiceImplName("%sServiceImpl");
            gc.setMapperName("%sMapper");
            gc.setXmlName("%sMapper");

            mpg.setGlobalConfig(gc);

            // 数据源配置
            DataSourceConfig dsc = new DataSourceConfig();
            dsc.setUrl(jdbcUrl);
            dsc.setDriverName(jdbcDriver);
            dsc.setUsername(jdbcUsername);
            dsc.setPassword(jdbcPassword);
            mpg.setDataSource(dsc);

            // 包配置
            PackageConfig pc = new PackageConfig();
            // 父级包名，按需修改
            pc.setParent(parentPackage);
            // 设置模块名, 会在parent包下生成一个指定的模块包
            pc.setModuleName(null);
            mpg.setPackageInfo(pc);


            // 策略配置
            StrategyConfig strategy = new StrategyConfig();
            strategy.setNaming(NamingStrategy.underline_to_camel);
            strategy.setColumnNaming(NamingStrategy.underline_to_camel);
            strategy.setRestControllerStyle(false);
            strategy.setInclude(tables);
            strategy.setSuperEntityColumns("id");
            // Controller驼峰连字符，如开启，则requestMapping由 helloWorld 变为 hello-world 默认false
            strategy.setControllerMappingHyphenStyle(false);
            strategy.setTablePrefix(pc.getModuleName() + "_");
            // 开启后将使用lombok注解代替set-get方法，false则生成set-get方法
            strategy.setEntityLombokModel(true);
            // 在实体类中移除is前缀
            strategy.setEntityBooleanColumnRemoveIsPrefix(true);
            mpg.setStrategy(strategy);
            mpg.setTemplateEngine(new VelocityTemplateEngine());
            mpg.execute();


//        // 代码生成器
//        AutoGenerator autoGenerator = new AutoGenerator();
//        // 全局配置
//        GlobalConfig globalConfig = new GlobalConfig();
//        //生成文件的输出目录
//        System.out.println(System.getProperty("user.dir"));
//        String path="System.getProperty("user.dir")"+"src//main//java";
//        globalConfig.setOutputDir(path);
//        // Author设置作者
//        globalConfig.setAuthor("sitech");
//        // 文件覆盖
//        globalConfig.setFileOverride(true);
//        // 生成后打开文件
//        globalConfig.setOpen(false);
//        // 自定义文件名风格，%s自动填充表实体属性
//        globalConfig.setMapperName("%sMapper");
//        globalConfig.setXmlName("%sMapper");
////        globalConfig.setServiceName("%sDao");
////        globalConfig.setServiceImplName("%sDaoImpl");
//        globalConfig.setEntityName("%s");
////        globalConfig.setControllerName("%sController");
//        autoGenerator.setGlobalConfig(globalConfig);
//
//        // 数据源配置
//        DataSourceConfig dataSourceConfig = new DataSourceConfig();
//        dataSourceConfig.setDbType(DbType.MYSQL);
//        dataSourceConfig.setTypeConvert(new MySqlTypeConvert());
//        dataSourceConfig.setUrl("jdbc:mysql://172.18.196.224:8880/comadm");
//        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
//        dataSourceConfig.setUsername("comadmopr");
//        dataSourceConfig.setPassword("comadmopr1@3$");
//        autoGenerator.setDataSource(dataSourceConfig);
//
//        // 包名配置
//        PackageConfig packageConfig = new PackageConfig();
//        // 父包和子包名分开处理
//        packageConfig.setParent("com.lv");
////        packageConfig.setController("web");
//        packageConfig.setEntity("bean");
//        packageConfig.setMapper("dao.mapper");
//        packageConfig.setXml("resources.mybatis.mapper");
////        packageConfig.setService("dao");
////        packageConfig.setServiceImpl("dao.impl");
//        autoGenerator.setPackageInfo(packageConfig);
//
//        // 生成策略配置
//        StrategyConfig strategy = new StrategyConfig();
//        //设置命名格式
//        strategy.setNaming(NamingStrategy.underline_to_camel);
//        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
//        // 实体是否为lombok模型，默认 false
//        strategy.setEntityLombokModel(true);
//        //生成 @RestController 控制器
//        strategy.setRestControllerStyle(true);
//        // 驼峰转连字符
//        strategy.setControllerMappingHyphenStyle(true);
//        //表和前缀处理
//        strategy.setInclude("os_time_order".split(","));
////        String[] tablePre = new String[]{"dt_"};
////        strategy.setTablePrefix(tablePre);
//        autoGenerator.setStrategy(strategy);
//        // 执行，以上相关参数可以基于动态输入获取
//        autoGenerator.execute();
    }
}
