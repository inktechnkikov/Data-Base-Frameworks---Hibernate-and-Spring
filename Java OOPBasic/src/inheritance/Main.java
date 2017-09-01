package inheritance;


public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird(1,"f",1);
        bird.sleep();
        bird.fly();
        bird.eat();
        Fish fish = new Fish(2,"m",2);
        fish.swim();
        fish.eat();
        fish.sleep();
    }
}
