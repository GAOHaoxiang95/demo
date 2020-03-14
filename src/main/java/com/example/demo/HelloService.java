package com.example.demo;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloService {
	
	@RequestMapping(name="/hello", method=RequestMethod.GET)
	public String hello() {
		return "hello SB";
	}
}
