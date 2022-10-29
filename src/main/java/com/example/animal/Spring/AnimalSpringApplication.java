package com.example.animal.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnimalSpringApplication {

	public static void main(String[] args) {
		System.out.println("here");
		SpringApplication.run(AnimalSpringApplication.class, args);
		System.out.println("done");
	}

}
