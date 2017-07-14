package Polymorphism.Rectangle;


public class Sqaure extends Rectangle{

    public Sqaure(double sideA) {
        super(sideA);
    }
    @Override
    protected double calculateArea(){
        double area = this.getSideA() * this.getSideA();
       System.out.println(area);
       return area;
   }
   @Override
    protected double calculatePerimeter(){
        double p = this.getSideA() * 4;
       System.out.println(p);
       return p;
   }
}
