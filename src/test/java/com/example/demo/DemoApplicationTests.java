package com.example.demo;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

	@Autowired
	JmsComponent jc;
	
	@Test
	void contextLoads() {
		Message msg = new Message();
		msg.setContent("hello jms");
		msg.setDate(new Date());
		
		jc.send(msg);
	}

}
