package com.example.Springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/hai")
	public String Welcome()
	{
		return "hello welcome";
	}
	@GetMapping("/hello")
	public String name()
	{
		return "hello welcome to mpl";
	}
	
	

}
