package ClassAndObjects;


public class Human {
    private static int counter = 0;
    private String name;
    private int age;
    private String eyeColor;

    public Human(String name, int age, String eyeColor) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
        counter++;
    }

    private String getName() {
        return this.name;
    }

    private int getAge() {
        return this.age;
    }

    private String getEyeColor() {
        return this.eyeColor;
    }
    public void speak(){
        System.out.printf("Hello.My name is %s%n",this.getName());
        System.out.printf("I am %s years old%n",this.getAge());
        System.out.printf("My eye color is %s",this.getEyeColor());
    }
    public void walk(){
        System.out.printf("Yes.i walking...");
    }
    public int printNumberOfHuman(){
        return counter;
    }
}
