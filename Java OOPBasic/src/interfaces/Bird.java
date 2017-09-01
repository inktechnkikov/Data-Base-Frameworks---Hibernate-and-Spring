package interfaces;


public class Bird extends Animal{
    public Bird(int age, String gender, double weight) {
        super(age, gender, weight);
    }
    public void eat(){
        System.out.println("Can eating insects");
    }

}
