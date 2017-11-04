package Asbtraction.Shapes;


public class Circle extends Shape{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public void calcPerimeter() {
        double circlePerimeter = 2 * Math.PI * radius;
        System.out.println(circlePerimeter);
    }

    @Override
    public void calcArea() {
        double circleArea = Math.PI * radius * radius;
        System.out.println(circleArea);
    }
}
