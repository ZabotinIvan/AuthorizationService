package com.example.AuthorizationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class AuthorizationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthorizationServiceApplication.class, args);
		final var context = new AnnotationConfigApplicationContext("com.example.AuthorizationService");
		final var controller = context.getBean("authorizationController");
		final var service = context.getBean("authorizationService");
		final var repository = context.getBean("userRepository");


	}
}
