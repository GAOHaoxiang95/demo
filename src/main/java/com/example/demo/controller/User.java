package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

public class User {

	private String name;
	private int age;
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public static List<User> getUsers(){
		List<User> users = new ArrayList<User>();
		for (int i=0; i<5;i++) {
			User u = new User("test" + i, 10 + i);
			users.add(u);
		}
		return users;
	}
	
}
