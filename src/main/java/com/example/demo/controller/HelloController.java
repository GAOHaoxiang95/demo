package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.UserMapper;
import com.example.demo.ser.UserService;


@RestController
@RequestMapping("/hw")
public class HelloController {

	@Autowired
	private UserService us;
	
	@RequestMapping(value = "/hello4", method = RequestMethod.GET)
	public String hello(Model model) {
		model.addAttribute("users", User.getUsers());
		return "hello";
	}

	//@Autowired
	//private UserMapper userMapper;

	@RequestMapping(value = "/hello6.do", method = RequestMethod.GET)
	public List<User> sl() {
		//User u = new User("lily", 15);
		//u.setId(3);
		//userMapper.insert(u);

		//model.addAttribute("users", userMapper.getAll());
		//return "hello";
		return us.sl();
	}
	
	/*
	@RequestMapping(value = "/hello7.do", method = RequestMethod.GET)
	public String hello7(Model model) {
		model.addAttribute("users", userMapper.getAll());
		return "hello";
	}
	*/
}
