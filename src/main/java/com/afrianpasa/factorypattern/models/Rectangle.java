package com.afrianpasa.factorypattern.models;

import com.afrianpasa.factorypattern.interfaces.Shape;

public class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw mehtod");
		
	}
	
}
