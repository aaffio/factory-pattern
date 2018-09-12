package com.afrianpasa.factorypattern.models;

import com.afrianpasa.factorypattern.interfaces.Shape;

public class Square implements Shape{

	@Override
	public void draw() {
		System.out.println("Inside Square::draw mehtod");
		
	}
	
}
