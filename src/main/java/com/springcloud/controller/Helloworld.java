package com.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {
	@RequestMapping(value="/get")
	public String Hello() {
		return "hello world";
	}

}
