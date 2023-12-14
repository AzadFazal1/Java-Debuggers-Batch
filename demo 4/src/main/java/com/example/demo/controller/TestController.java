package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.Animal;

@RestController
@RequestMapping("/autowire")
public class TestController {
	
//	@Qualifier("cat")
//	@Autowired
	private Animal animal;
	
	@Autowired(required=false)
	public TestController(@Qualifier("dog") Animal animal) {
		this.animal = animal;
	}
//	@Autowired(required = false)
//	public void setAnimal(@Qualifier("dog") Animal animal) {
//		this.animal = animal;
//	}
	
	@GetMapping
	public String fetchAnimalCharacteristics() {
		return animal.characteristics();
	}

}
