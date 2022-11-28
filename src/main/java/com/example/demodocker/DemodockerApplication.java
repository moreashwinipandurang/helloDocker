package com.example.demodocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemodockerApplication
{
	@GetMapping("/hello")
	public String message()
	{
		return "hello world";
	}
	
	public static void main(String[] args)
	{
		SpringApplication.run(DemodockerApplication.class, args);
	}

}
