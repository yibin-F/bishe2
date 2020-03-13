package com.bishe2.bishe2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("com.bishe2.bishe2.mapper")
public class Bishe2Application {

    public static void main(String[] args) {
        SpringApplication.run(Bishe2Application.class, args);
    }

}
