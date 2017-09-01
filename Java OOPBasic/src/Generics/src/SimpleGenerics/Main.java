package Generics.src.SimpleGenerics;

public class Main {
    public static void main(String[] args) {
        GenericBox<String,String,Double> test = new GenericBox<>("Stamat","Tomov",5.45);
        test.printInfo();
    }
}
