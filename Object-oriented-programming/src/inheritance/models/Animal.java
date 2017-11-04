package inheritance.models;

public abstract class Animal {
    private double weight;
    private int age;
    public Animal(double weight,int age){
        this.weight = weight;
        this.age = age;
    }
    public String getInfo(){
      return String.format("weight %s,age %s",this.weight,this.age);
    }
    public abstract String getTypicalSound();

}
