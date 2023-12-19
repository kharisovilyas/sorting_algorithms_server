package ru.technolog.sorting_algorithms_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "http://localhost:8080")
public class SoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoringApplication.class, args);
	}

}
