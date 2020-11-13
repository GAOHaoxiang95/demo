package com.example.demo.mapper;

import java.util.List;

import com.example.demo.controller.Diary;

public interface DiaryMapper {

	public List<Diary> getAll();
	
	public void insertContent(String title, String content, String create_date);
	
	public List<Diary> getByPage(int page);

	//public void insertContent(Diary d);
	
}
