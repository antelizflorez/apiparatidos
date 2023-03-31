package com.unab.apipartidos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})

public class ApipartidosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApipartidosApplication.class, args);
		System.out.println("Api corriendo...");
	}

}
