package com.javabanters.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* @SpringBootApplication is composed of
 * @EnableAutoConfiguration - Enables Spring Boot's auto-configuration support
 * @ComponentScan - Enables component scanning of current package.Also recursively scans sub -packages
 * @Configuration - Able to register extra beans with @Bean or import other configuration classes
*/
//@SpringBootApplication(scanBasePackages = {"com.javabanters.util",
//											"com.javabanters.springcoredemo"})
@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
