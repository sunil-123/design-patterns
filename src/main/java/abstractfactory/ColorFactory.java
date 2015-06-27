package main.java.abstractfactory;

public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        if (color == null) {
            throw new NullPointerException("Color value cannot be null");
        }

        if (color.equalsIgnoreCase("red")) {
            return new Red();
        } else if (color.equalsIgnoreCase("blue")) {
            return new Blue();
        } else if (color.equalsIgnoreCase("green")) {
            return new Green();
        } else {
            throw new RuntimeException("Please provide valid color");
        }
    }

    @Override
    public Shape getShape(String shape) {
        throw new RuntimeException("ColorFactory cannot create shape");
    }
}
