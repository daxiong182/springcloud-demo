package com.courage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("com.courage.repostories")
public class MenuApplication {
    public static void main(String[] args) {
        SpringApplication.run(MenuApplication.class,args);
    }
}
