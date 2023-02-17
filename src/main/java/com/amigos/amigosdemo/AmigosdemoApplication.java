package com.amigos.amigosdemo;

import com.amigos.amigosdemo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class AmigosdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmigosdemoApplication.class, args);

	}

	@GetMapping
	public List<Student> hello() {
		return List.of(
				new Student(
						1L,
						"Jordan",
						"jordan.wolter@icloud.com",
						LocalDate.of(1992, Month.MAY, 13),
						30
				)
		);
	}
}
