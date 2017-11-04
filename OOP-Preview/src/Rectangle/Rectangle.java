package Rectangle;


public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width,int height){
        this.width = width;
        this.height = height;
    }
    private int getWidth(){
        return this.width;
    }
    private int getHeight(){
        return this.height;
    }
    private int calcArea(){
        return this.getWidth() * this.getHeight();
    }
    public String rectangleArea(){
        return String.format("Area = %d",calcArea());
    }

}
