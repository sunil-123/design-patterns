package main.java.factory;

import javax.lang.model.type.UnknownTypeException;

public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            throw new NullPointerException("Please provide shape name");
        }

        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("square")) {
            return new Square();
        } else {
            throw new RuntimeException("Sorry didn't recognized the shape");
        }
    }
}
