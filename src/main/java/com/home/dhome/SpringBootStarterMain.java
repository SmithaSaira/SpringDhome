package com.home.dhome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootStarterMain {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        SpringApplication.run(SpringBootStarterMain.class,args);
    }
}