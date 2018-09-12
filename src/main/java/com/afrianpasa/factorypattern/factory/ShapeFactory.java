package com.afrianpasa.factorypattern.factory;

import com.afrianpasa.factorypattern.interfaces.Shape;
import com.afrianpasa.factorypattern.models.Circle;
import com.afrianpasa.factorypattern.models.Rectangle;
import com.afrianpasa.factorypattern.models.Square;

public class ShapeFactory {
	public Shape getShape(String shape) {
		if(shape==null)
			return null;
		if(shape.equalsIgnoreCase("circle")) {
			return new Circle();
		}else if(shape.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		}else if(shape.equalsIgnoreCase("square")) {
			return new Square();
		}
		return null;
	}
}
