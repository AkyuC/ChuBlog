package com.chu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: Chu
 * @description: 博客启动类
 * @date: 2023/12/22 14:50
 * @version: 1.0
 */
@SpringBootApplication
@MapperScan("com.chu.mapper")
public class BlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }

}
