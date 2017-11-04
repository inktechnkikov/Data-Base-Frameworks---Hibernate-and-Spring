package Asbtraction.Shapes;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2,2);
        Shape circle = new Circle(3);
        List<Shape> shapes = new ArrayList<>();
        shapes.add(rectangle);
        shapes.add(circle);
        for (Shape shape : shapes) {
            shape.calcArea();
            shape.calcPerimeter();
        }
    }
}
