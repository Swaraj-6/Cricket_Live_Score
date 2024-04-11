package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CricketScoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CricketScoreApplication.class, args);
		System.out.println("Server Started ...");
	}

}
