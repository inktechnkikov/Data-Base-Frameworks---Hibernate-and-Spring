package interfaces;


public class Main {
    public static void main(String[] args) {
      Chicken chicken = new Chicken(1,"m",2.5);
      Sparrow sparrow = new Sparrow(1,"m",0.5);
      sparrow.fly();
      chicken.eat();
      sparrow.eat();
    }
}
