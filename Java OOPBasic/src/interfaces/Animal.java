package interfaces;


public class Animal {
    private int age;
    private String gendger;
    private double weight;

    public Animal(int age,String gender,double weight){
        this.age = age;
        this.gendger = gender;
        this.weight = weight;
    }
    protected void eat(){
        System.out.println("Eating");
    }
    protected void sleep(){
        System.out.println("sleeping");
    }
}
