package inheritance;

import inheritance.models.Dog;

public class starter {
    public static void main(String[] args) {
        Dog dog = new Dog(10.00,2,"grey");
        dog.getTypicalSound();
        System.out.println(dog.getInfo());
    }
}
