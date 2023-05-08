package com.springboot.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Primary
@Service
public class Cat implements Animal {

	@Override
	public String characteristics() {
		return "test conflit 2";
	}

}
