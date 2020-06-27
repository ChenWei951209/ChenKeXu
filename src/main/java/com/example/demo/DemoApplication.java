package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main1(String[] args) {
		SpringApplication.run(DemoApplication.class,args);
		System.out.println("Hello Git");
		System.out.println("创建分支");
		System.out.println("主干添加");
	}
}
