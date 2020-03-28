package com.example.demo;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@MapperScan(basePackages = {"com.example.demo.mapper"})
@SpringBootApplication
public class DemoApp {
	public static void main(String[] args) {
		SpringApplication.run(DemoApp.class, args);
	}
	
	@Bean
	Queue queue() {
		return new ActiveMQQueue("amq");
	}
}
