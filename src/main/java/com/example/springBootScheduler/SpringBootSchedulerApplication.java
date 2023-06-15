package com.example.springBootScheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling // annotation facilitates Spring Boot with scheduled task execution capability
public class SpringBootSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSchedulerApplication.class, args);
	}

}
