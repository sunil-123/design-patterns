package main.java.abstractfactory;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shape) {
        if (shape == null) {
            throw new NullPointerException("Please provide valid shape");
        }

        if (shape.equalsIgnoreCase("square")) {
            return new Square();
        } else if (shape.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("circle")) {
            return new Circle();
        } else {
            throw new RuntimeException("Please give valid shape name");
        }
    }

    @Override
    public Color getColor(String color) {
        throw new RuntimeException("ShapeFactory cannot produce colors");
    }
}
