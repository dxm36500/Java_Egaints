package com.mtc.app.Sender;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;



@Component
public class Senderclass {
	
	@Autowired
	private RabbitMessagingTemplate template;
	
	@Bean
	Queue queue()
	{
		return new Queue("TestQ");
	}
	
	
	public void sendMessage(String Message)
	{
		template.convertAndSend("TestQ",Message);
		
	}
	

}
