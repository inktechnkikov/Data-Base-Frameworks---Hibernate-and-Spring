package Inhretirtance;


public class Cat extends Animal{
    private String color;
    public Cat(int age, String height,String color) {
        super(age, height);
        this.color = color;
    }
    public void eat(){
        System.out.println("Eat mouses");
    }
    public void run(){
        System.out.println("Run very fast");
    }
}
