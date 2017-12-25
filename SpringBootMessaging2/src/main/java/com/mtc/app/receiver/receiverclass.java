package com.mtc.app.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class receiverclass {

	@RabbitListener(queues="TestQ")
	public void receivermsg(String message)
	{
		System.out.println("Message Received: "+message);
	}
}
