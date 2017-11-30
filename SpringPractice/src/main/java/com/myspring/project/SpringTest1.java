package com.myspring.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest1 {
//Object Injection
	public static void main(String[] args) {
		ApplicationContext context1=new ClassPathXmlApplicationContext("/META-INF/spring/app-context.xml");
		Triangle1 triangle1=(Triangle1) context1.getBean(Triangle1.class);
		triangle1.points();

	}

}
