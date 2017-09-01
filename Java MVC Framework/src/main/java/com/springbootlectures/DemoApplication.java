package com.springbootlectures;

import com.springbootlectures.entities.Dog;
import com.springbootlectures.interfaces.Animal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Scope("prototype")
	@Bean
	public Animal getDog(){
		return new Dog();
	}
}
