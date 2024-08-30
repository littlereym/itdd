package com.example.itdd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableAsync; 
import org.springframework.scheduling.annotation.EnableScheduling;



@ServletComponentScan
@EnableScheduling
@SpringBootApplication
@SpringBootConfiguration
@EnableAsync
public class ItddApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItddApplication.class, args);
	}

}
