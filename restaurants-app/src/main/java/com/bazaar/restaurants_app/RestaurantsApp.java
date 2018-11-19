package com.bazaar.restaurants_app;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestaurantsApp {
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(RestaurantsApp.class);
		System.out.println("hi");
		app.setDefaultProperties(Collections.singletonMap("server.port", "8083"));
		app.run(args);
	}
}
