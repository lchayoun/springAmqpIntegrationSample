package com.example.springAmqpIntegrationSample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableBinding({ExampleProcessor.class})
public class SpringAmqpIntegrationSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAmqpIntegrationSampleApplication.class, args);
	}
}
