package br.com.challenge.readbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"br/com/challenge/readbook/facade/BookFacade.java","br/com/challenge/readbook/controller/BookController.java"})
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
