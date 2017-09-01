package interfaces;

public class Chicken extends Bird{
    public Chicken(int age, String gender, double weight) {
        super(age, gender, weight);
    }
    @Override
    public void eat(){
        System.out.println("can eating insects and grass");
    }
}
