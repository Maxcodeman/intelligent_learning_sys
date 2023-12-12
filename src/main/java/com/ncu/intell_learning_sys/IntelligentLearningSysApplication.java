package com.ncu.intell_learning_sys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class IntelligentLearningSysApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntelligentLearningSysApplication.class, args);
    }

}
