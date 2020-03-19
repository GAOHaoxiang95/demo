package com.example.demo.ser;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.controller.User;
import com.example.demo.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper uMapper;
	
	@Override
	public List<User> sl() {
		// TODO Auto-generated method stub
		return uMapper.sl();
	}

}
