package ClassAndObjects;

public class Main {
    public static void main(String[] args) {
        Human pesho = new Human("Pesho",25,"brown");
        pesho.speak();
        System.out.println();
        pesho.walk();
        System.out.println(pesho.printNumberOfHuman());
    }
}
