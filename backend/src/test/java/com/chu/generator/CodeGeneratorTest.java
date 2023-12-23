package com.chu.generator;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.query.SQLQuery;
import org.junit.Test;

/**
 * @author: Chu
 * @description: 使用 mybatis plus autogenerator 生成代码
 * @date: 2023/12/23 12:31
 * @version: 1.0
 */
public class CodeGeneratorTest {
    /**
     * 数据源配置
     */
//    private static final DataSourceConfig DATA_SOURCE_CONFIG = new DataSourceConfig
//            .Builder("jdbc:mysql://localhost:3306/mysql?useUnicode=true", "root", "2021chu")
//            .build();

    private static final DataSourceConfig DATA_SOURCE_CONFIG = new DataSourceConfig
            .Builder("jdbc:mysql://localhost:3306/mysql?useUnicode=true;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE;CASE_INSENSITIVE_IDENTIFIERS=TRUE;MODE=MYSQL", "root", "2021chu")
            .databaseQueryClass(SQLQuery.class) // 设置SQL查询方式，默认的是元数据查询方式
            .build();

    @Test
    public void run() {
        // 代码生成器
        AutoGenerator generator = new AutoGenerator(DATA_SOURCE_CONFIG);

        // 全局配置
        String projectPath = System.getProperty("user.dir");
        generator.global(new GlobalConfig.Builder()
                .outputDir(projectPath + "/src/main/java")
                .author("chu")
                .enableKotlin()
                .enableSwagger()
                .dateType(DateType.TIME_PACK)
                .commentDate("yyyy-MM-dd")
                .build());

        // 包配置
        generator.packageInfo(new PackageConfig.Builder()
                        .parent("com.chu")
                        .entity("entity")
                        .service("service")
                        .serviceImpl("service.impl")
                        .mapper("mapper")
                        .xml("mapper.xml")
                        .controller("controller")
                        .build());

        // 配置模板
        generator.template(new TemplateConfig.Builder()
                .entity("templates/entity.java")
                .mapper("templates/mapper.java")
                .service("templates/service.java")
                .serviceImpl("templates/serviceImpl.java")
                .controller("templates/controller.java")
                .build());

        // 策略配置
        generator.strategy(new StrategyConfig.Builder()
                        .addInclude("t_album,t_article")
                        .addTablePrefix("t_")
                        .entityBuilder().enableFileOverride().enableLombok()
                        .controllerBuilder().enableFileOverride().enableRestStyle()
                        .serviceBuilder().enableFileOverride().formatServiceFileName("%sService").formatServiceImplFileName("%sServiceImp")
                        .mapperBuilder().enableFileOverride().enableBaseResultMap().enableBaseColumnList().formatXmlFileName("%sXml")
                        .build());

        generator.execute();
    }
}
