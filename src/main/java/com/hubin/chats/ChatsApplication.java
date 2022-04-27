package com.hubin.chats;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@SpringBootApplication
@MapperScan("com.hubin.chats.dao")
@ServletComponentScan
public class ChatsApplication {
    public static void main(String[] args) {
        SpringApplication.run(ChatsApplication.class, args);
    }

}
