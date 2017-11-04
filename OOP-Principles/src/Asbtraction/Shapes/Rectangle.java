package Asbtraction.Shapes;


public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    private double getLength(){
        return this.length;
    }
    private double getWidth(){
        return this.width;
    }
    @Override
    public void calcPerimeter() {
       double p = 2 * (this.getLength() + this.getWidth());
        System.out.println(p);
    }

    @Override
    public void calcArea() {
       double area = this.getWidth() * this.getLength();
        System.out.println(area);
    }
}
