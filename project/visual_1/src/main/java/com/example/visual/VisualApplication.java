package com.example.visual;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //指定启动项目的类

//指定要扫描的mybatis映射类的路径
@MapperScan("com.example.visual.repository")

public class VisualApplication {

    public static void main(String[] args) {
        SpringApplication.run(VisualApplication.class, args);
    }

}
