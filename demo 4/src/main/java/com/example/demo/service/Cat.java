package com.example.demo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Service
public class Cat implements Animal {

	@Override
	public String characteristics() {
		return "Meow";
	}

}
