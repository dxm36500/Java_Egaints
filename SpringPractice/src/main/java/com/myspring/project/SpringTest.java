package com.myspring.project;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Constructor Injection

public class SpringTest {
	
	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("/META-INF/spring/app-context.xml");
		Triangle triangle =(Triangle) context.getBean("triangle");
		triangle.draw();
	}

}
