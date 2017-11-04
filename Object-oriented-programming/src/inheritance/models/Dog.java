package inheritance.models;

public class Dog extends Animal{

    private String color;
    public Dog(double weight, int age,String color) {
        super(weight, age);
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }

    @Override
    public String getTypicalSound() {
        String getSound = "Wof-wof";
        System.out.println(getSound);
        return getSound;
    }

}
