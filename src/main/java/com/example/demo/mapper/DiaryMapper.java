package com.example.demo.mapper;

import java.util.List;

import com.example.demo.controller.Diary;

public interface DiaryMapper {

	public List<Diary> getAll();
	
	public void insertContent();
	
}
