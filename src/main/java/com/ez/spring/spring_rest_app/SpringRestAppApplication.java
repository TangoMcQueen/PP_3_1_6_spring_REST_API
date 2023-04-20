package com.ez.spring.spring_rest_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringRestAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication
				.run(SpringRestAppApplication.class, args);
		Communication communication = context
				.getBean("communication", Communication.class);
		System.out.println("True answer: " + communication.getAnswer());
	}
}
