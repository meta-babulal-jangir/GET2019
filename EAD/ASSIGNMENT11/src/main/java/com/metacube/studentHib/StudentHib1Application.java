package com.metacube.studentHib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication//exclude=HibernateJpaAutoConfiguration.class)

public class StudentHib1Application {

	public static void main(String[] args) {
		SpringApplication.run(StudentHib1Application.class, args);
	}

}
