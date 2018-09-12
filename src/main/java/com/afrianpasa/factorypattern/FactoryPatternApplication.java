package com.afrianpasa.factorypattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.afrianpasa.factorypattern.factory.ShapeFactory;
import com.afrianpasa.factorypattern.interfaces.Shape;

@SpringBootApplication
public class FactoryPatternApplication {
	public static void main(String[] args) {
		SpringApplication.run(FactoryPatternApplication.class, args);
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape1 = shapeFactory.getShape("circle");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("rectangle");
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape("square");
		shape3.draw();
	}
}
