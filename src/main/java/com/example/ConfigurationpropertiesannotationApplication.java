package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:config.properties")
public class ConfigurationpropertiesannotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationpropertiesannotationApplication.class, args);
	}
}
