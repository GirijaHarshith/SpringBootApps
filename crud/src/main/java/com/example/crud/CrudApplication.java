package com.example.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

//	@GetMapping("")
//	static String hello(){
//		return "Hello Chinni";
//	}
}

/*

MAVEN:
mvn clean - used o remove previously compiled file
mvn package - package
mvn build - build compile
mvn run - run

mvn run = clean+package+build+run -> SO when you run, all these will run.
So we have done configuration to run.
We can also do for build:
mvn build = clean+package+build

Also, we have
mvn install
 */
