package interfaces;


public class Fish extends Animal{
    public Fish(int age, String gender, double weight) {
        super(age, gender, weight);
    }
    protected void swim(){
        System.out.println("Swimming");
    }
}
