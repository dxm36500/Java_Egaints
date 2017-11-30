package com.myspring.project;

import org.springframework.stereotype.Component;

@Component
public class Triangle {
	
	private String Edges;
	
	public Triangle(String Edges) {
		
		this.Edges = Edges;
		System.out.println("Edges Constructor");
	}
	
	private int height;
	
	public Triangle(int height) {
		
		this.height=height;
		System.out.println("Height Constructor");
	}
	
	
	public Triangle(String edges, int height) {
		
		Edges = edges;
		this.height = height;
		System.out.println("Edges & Height Constructor");
	}

	private String type;
	

	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public void draw()
	{
		System.out.println("Traingle Drawn is"+getType());
		System.out.println(" Equilatral Traingle has "+Edges);
		System.out.println("Height of the traingle is "+height);
		
	}
	
}
