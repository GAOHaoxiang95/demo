package com.example.demo;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class JmsComponent {

	@Autowired
	JmsMessagingTemplate mt;
	
	@Autowired
	Queue queue;
	
	public void send(Message msg) {
		mt.convertAndSend(this.queue, msg);
	}
	
	@JmsListener(destination = "amq")
	public void receive(Message msg) {
		System.out.println("receive:" + msg.getContent());
//		File file = new File("E:\\log.txt"); // 找到File类的实例
//		
//		try {
//		// 创建文件
//		    file.createNewFile(); 
//		// 声明字符输出流
//		    Writer out = null; 
//		// 通过子类实例化，表示可以追加
//		    out = new FileWriter(file,true); 
//		// 写入数据
//		    out.write(msg.getContent()); 
//		// 保存数据
//		    out.close();
//		
//		} catch (IOException e) {
//		    e.printStackTrace();
//		}
		
	}
}
