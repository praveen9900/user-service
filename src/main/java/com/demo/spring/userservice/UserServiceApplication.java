package com.demo.spring.userservice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);

	}

	@GetMapping("/greetings")
	public String getGreeting() {
		return "Congratulations!! You have succesfully deployed your application on K8s cluster";
	}

	@GetMapping
	public List<User> getUsers() {
		return Stream.of(new User(1, "Praveen", "praveen@gmail.com"),
				new User(2,"Ravi","ravi@gmail.com"),
				new User(3,"Veeresh","veeresh@gmail.com")).collect(Collectors.toList());

	}

}
