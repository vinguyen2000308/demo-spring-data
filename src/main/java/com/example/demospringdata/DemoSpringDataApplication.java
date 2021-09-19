package com.example.demospringdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringDataApplication {

    // Profile -dev
    // Different accept-language -> different database

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringDataApplication.class, args);
    }

}
