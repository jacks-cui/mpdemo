package com.cent.mpdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cent.mpdemo.mapper")
public class AuthorityDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthorityDemoApplication.class, args);
    }

}
