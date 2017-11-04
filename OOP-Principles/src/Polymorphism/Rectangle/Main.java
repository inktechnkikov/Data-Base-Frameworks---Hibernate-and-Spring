package Polymorphism.Rectangle;


public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,5);
        Sqaure sqaure = new Sqaure(8);
        rectangle.calculatePerimeter();
        rectangle.calculateArea();

        sqaure.calculatePerimeter();
        sqaure.calculateArea();

    }
}
