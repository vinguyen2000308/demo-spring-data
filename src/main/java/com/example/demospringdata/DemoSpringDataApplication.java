package com.example.demospringdata;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.io.PrintStream;
import java.util.Locale;

@SpringBootApplication
public class DemoSpringDataApplication {

    // Profile -dev
    // Different accept-language -> different database


    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(DemoSpringDataApplication.class);
        application.setBanner((environment, sourceClass, out) -> {
            out.println("Nguyen Vi");
        });
       application.run(args);
    }

}
