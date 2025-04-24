package com.example.ai.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AiDemoApplication {

	static Logger log = LoggerFactory.getLogger(AiDemoApplication.class);

	public static void main(String[] args) {
		log.info("start the application");
		SpringApplication.run(AiDemoApplication.class, args);
	}

}
