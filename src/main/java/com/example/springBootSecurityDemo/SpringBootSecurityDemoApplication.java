package com.example.springBootSecurityDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@ConfigurationPropertiesScan("com.example.springBootSecurityDemo.jwt")
//@EnableConfigurationProperties(ConfigurationProperties.class)
public class SpringBootSecurityDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootSecurityDemoApplication.class, args);
	}

}
