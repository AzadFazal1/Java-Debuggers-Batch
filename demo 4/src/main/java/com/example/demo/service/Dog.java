package com.example.demo.service;

import org.springframework.stereotype.Service;

//@Service
public class Dog implements Animal {

	@Override
	public String characteristics() {
		return "Bark";
	}

}
