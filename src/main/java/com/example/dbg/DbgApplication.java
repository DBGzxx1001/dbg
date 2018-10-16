package com.example.dbg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@EnableAutoConfiguration
public class DbgApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbgApplication.class, args);
		System.out.println("hello world");
	}
}
