package Inhretirtance;


public class Animal {
    protected int age;
    protected String height;

    public Animal(int age,String height){
        this.age = age;
        this.height = height;
    }
    public void eat(){
        System.out.println("eating");
    }
    public void run(){
        System.out.println("run");
    }
}
