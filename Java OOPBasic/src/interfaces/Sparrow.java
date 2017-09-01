package interfaces;

public class Sparrow extends Bird implements Flyable{
    public Sparrow(int age, String gender, double weight) {
        super(age, gender, weight);
    }

    @Override
    public void fly() {
        System.out.println("Sparrow can flying high");
    }
    @Override
    public void eat(){
        super.eat();
    }
}
