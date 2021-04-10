package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;



@SpringBootApplication

//指定要扫描的mybatis映射类的路径
@MapperScan("com.example.demo.model")
@MapperScan("com.example.demo.repository")

public class MybatiDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(MybatiDemoApplication.class, args);
    }

}
