package com.afrianpasa.factorypattern.models;

import com.afrianpasa.factorypattern.interfaces.Shape;

public class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw mehtod");
		
	}
	
}
