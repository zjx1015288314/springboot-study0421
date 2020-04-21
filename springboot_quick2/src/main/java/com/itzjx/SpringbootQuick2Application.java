package com.itzjx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication   //该注解所在包及其子包下的所有类都会被扫描
public class SpringbootQuick2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootQuick2Application.class, args);
    }

}
