package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping(value = "/hello4", method=RequestMethod.GET)
	public String hello(Model model) {
		model.addAttribute("users", User.getUsers());
		return "hello";
	}
}
