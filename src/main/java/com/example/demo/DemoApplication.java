package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.cecwebsolutions.studentapp.model")
@EnableJpaRepositories(basePackages = "com.cecwebsolutions.studentapp.repository")
@ComponentScan({"com.example.demo","com.cecwebsolutions.studentapp.controller","com.cecwebsolutions.studentapp.model","com.cecwebsolutions.studentapp.repository","com.cecwebsolutions.studentapp.service"})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
