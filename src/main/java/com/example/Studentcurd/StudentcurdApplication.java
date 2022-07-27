package com.example.Studentcurd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class StudentcurdApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentcurdApplication.class, args);
	}

}

//@SpringBootApplication(scanBasePackages={
//"com.example.something", "com.example.application"})