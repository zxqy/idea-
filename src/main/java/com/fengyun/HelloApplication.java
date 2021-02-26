package com.fengyun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
 * @SpringBootApplication 这个引用为注程序类，说明这是一个Spring Boot的应用
 */
@SpringBootApplication
public class HelloApplication {
    public static void main(String[] args){
        //Spring应用启动
        SpringApplication.run(HelloApplication.class,args);
        }
}
