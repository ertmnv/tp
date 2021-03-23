package com.hoaxify.hoaxify;


import java.util.stream.IntStream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.hoaxify.hoaxify.user.User;
import com.hoaxify.hoaxify.user.UserService;

@SpringBootApplication
public class HoaxifyApplication {

	public static void main(String[] args) {
		SpringApplication.run(HoaxifyApplication.class, args);
		User u = new User();
	}
	
	@Bean
	@Profile("!test")
	CommandLineRunner run (UserService userService) {
	    return (args) -> {
	        IntStream.rangeClosed(1, 15).mapToObj(i -> {
	            User user = new User();
	            user.setUsername("username" + i);
	            user.setDisplayName("display" + i);
	            user.setPassword("Password");
	            return user;
	        }).forEach(userService::save);
	    };
	}
	

}
