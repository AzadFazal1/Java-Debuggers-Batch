package com.example.demo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class Chimp implements Animal{

	@Override
	public String characteristics() {
		return "OO AA";
	}

}
