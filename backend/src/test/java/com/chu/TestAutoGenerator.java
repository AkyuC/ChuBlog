package com.chu;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.query.SQLQuery;
import org.junit.Test;

/**
 * @author: Chu
 * @description: TODO
 * @date: 2023/12/23 15:17
 * @version: 1.0
 */
public class TestAutoGenerator {
    private static final DataSourceConfig DATA_SOURCE_CONFIG = new DataSourceConfig
            .Builder("jdbc:mysql://localhost:3306/mysql?useUnicode=true", "root", "2021chu")
            .databaseQueryClass(SQLQuery.class) // 设置SQL查询方式，默认的是元数据查询方式
            .build();

    @Test
    public void run(){
        // 代码生成器
        AutoGenerator generator = new AutoGenerator(DATA_SOURCE_CONFIG);

        // 全局配置
        generator.global(new GlobalConfig.Builder()
                .outputDir(System.getProperty("user.dir") + "/src/main/java") // 输出目录
                .author("chu")
                .enableSwagger()
                .dateType(DateType.TIME_PACK)
                .commentDate("yyyy-MM-dd")
                .build());

        // 包配置
        generator.packageInfo(new PackageConfig.Builder()
                .parent("com.chu") // 父包模块名
                .entity("entity")
                .service("service")
                .serviceImpl("service.impl")
                .mapper("mapper")
                .xml("mapper.xml")
                .controller("controller")
                .build());

        // 模板配置
        generator.template(new TemplateConfig.Builder()
               .entity("/templates/entity.java.vm")
               .service("/templates/service.java.vm")
               .serviceImpl("/templates/serviceImpl.java.vm")
               .mapper("/templates/mapper.java.vm")
               .xml("/templates/mapper.xml.vm")
               .controller("/templates/controller.java.vm")
               .build());

        // 策略配置
        String tables = "t_album,t_article,t_article_tag,t_blog_file,t_category,t_comment,t_exception_log," +
                "t_friend,t_photo,t_site_config,t_tag,t_task,t_task_log,t_visit_log"; // 所有表的名字,用逗号分隔
        generator.strategy(new StrategyConfig.Builder()
                .addInclude(tables)
                .addTablePrefix("t_") // 表前缀
                .entityBuilder().enableFileOverride().enableLombok()
                .controllerBuilder().enableFileOverride().enableRestStyle().formatFileName("%sController")
                .serviceBuilder().enableFileOverride().formatServiceFileName("%sService").formatServiceImplFileName("%sServiceImp")
                .mapperBuilder().enableFileOverride().enableBaseResultMap().enableBaseColumnList().formatXmlFileName("%sXml")
                .build());

        generator.execute();
    }
}
