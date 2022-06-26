package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>demo java docs dengan swagger!</p>
 * 
 * @author Chandra
 * @since 26/06/2022
 * @version 1.0
 */
@RestController
public class HelloController {

	@RequestMapping(method = RequestMethod.GET, value = "/api/hactive8")
	public String sayHello() {
		return "Swagger Hello World";
	}
}