package com.example.demo;

import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6805672246902645467L;
	private String content;
	private Date date;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
