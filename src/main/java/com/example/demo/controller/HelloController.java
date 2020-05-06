package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.DiaryMapper;
import com.example.demo.mapper.UserMapper;



@Controller
@RequestMapping("/us")
public class HelloController {
	@Autowired
	private UserMapper userMapper;

	@Autowired
	private DiaryMapper diaryMapper;
	/*
	@RequestMapping(value = "/hello4", method = RequestMethod.GET)
	public String hello(Model model) {
		model.addAttribute("users", User.getUsers());
		return "hello";
	}

	@RequestMapping(value = "/hello6.do", method = RequestMethod.GET)
	public List<User> sl() {
		//User u = new User("lily", 15);
		//u.setId(3);
		//userMapper.insert(u);
		//this is a test
		//model.addAttribute("users", userMapper.getAll());
		//return "hello";
		return userMapper.sl();
	}
	*/
	
	@RequestMapping(value = "/hello7.do", method = RequestMethod.GET)
	public String hello7(Model model) {
		model.addAttribute("users", userMapper.getAll());
		return "hello";
	}
	
	@RequestMapping(value = "/diary", method = RequestMethod.GET)
	public String context(Model model) {
		model.addAttribute("diaries", diaryMapper.getAll());
		return "diary";
	}
	
	@RequestMapping(value = "/addDiary", method = RequestMethod.GET)
	public String add(Model model) {
		return "login";
	}
	
	@RequestMapping(value= "/upload", method = RequestMethod.GET)
	public String upload(@RequestParam Map<String,String> param) {
		String title = param.get("title");
		String create_date = param.get("create_date");
		String content = param.get("content");
		
		System.out.println(content);
		System.out.println(title);
		System.out.println(create_date);
		return "success";
	}
	
}
