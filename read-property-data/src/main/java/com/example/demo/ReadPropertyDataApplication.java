package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@PropertySources(@PropertySource("classpath:read.properties"))
public class ReadPropertyDataApplication {

	@Value("${read}")
	String read;
//	@Value("${classpath}")
	String readOneMore;
	public static void main(String[] args) {
		SpringApplication.run(ReadPropertyDataApplication.class, args);
	}

	@RequestMapping("/properties")
	public String hello() {
		
		return read;
	}
	
	@RequestMapping("/read")
	public String read()
	{
		return readOneMore;
	}
}
