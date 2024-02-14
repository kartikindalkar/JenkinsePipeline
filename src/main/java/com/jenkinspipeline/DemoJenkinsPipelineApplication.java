package com.jenkinspipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJenkinsPipelineApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoJenkinsPipelineApplication.class, args);
		System.out.println("Hello World Jenkins");
	}

}
