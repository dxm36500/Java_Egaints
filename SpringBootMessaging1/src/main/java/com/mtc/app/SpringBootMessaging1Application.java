package com.mtc.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mtc.app.Sender.Senderclass;

@SpringBootApplication
public class SpringBootMessaging1Application implements CommandLineRunner{
	
	@Autowired
	Senderclass sender;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMessaging1Application.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		sender.sendMessage("Welcome to Spring Boot Messaging");
		
	}
}
