package com.example.AuthorizationService;
import com.example.AuthorizationService.Config.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class AuthorizationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthorizationServiceApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);





	}
}
