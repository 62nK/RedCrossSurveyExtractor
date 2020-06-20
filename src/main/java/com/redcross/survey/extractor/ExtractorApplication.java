package com.redcross.survey.extractor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class ExtractorApplication {
	
	private Environment env;

	public static void main(String[] args) {
		SpringApplication.run(ExtractorApplication.class, args);
	}

}
