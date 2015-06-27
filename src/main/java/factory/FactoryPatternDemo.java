package main.java.factory;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.getShape("circle");
        circle.draw();

        Shape rectangle = factory.getShape("rectangle");
        rectangle.draw();

        Shape square = factory.getShape("square");
        square.draw();

//        Shape unknown = factory.getShape("unknown");
//        unknown.draw();

        Shape nullShape = factory.getShape(null);
        nullShape.draw();
    }
}
