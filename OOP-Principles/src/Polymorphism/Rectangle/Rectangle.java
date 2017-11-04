package Polymorphism.Rectangle;


public class Rectangle {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA,double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }
    public Rectangle(double sideA){
        this.sideA = sideA;
    }
    protected double getSideA(){
        return this.sideA;
    }
    protected double getSideB(){
        return this.sideB;
    }
    protected double calculateArea(){
        double area = this.getSideA() * this.getSideB();
        System.out.println(area);
        return area;
    }
    protected double calculatePerimeter(){
        double perimeter = this.getSideA() * 2 + this.getSideB() * 2;
        System.out.println(perimeter);
        return perimeter;
    }
}
