package CarShop;


public class Main {
    public static void main(String[] args) {
      Rentable audi = new Audi("A6","White",145,10,5);
        printCarInfo(audi);
    }
    private static void printCarInfo(Car car){
        System.out.println(String.format("%s is %s color and have %s horse power",car.getModel(),car.getColor()
        ,car.getHorsePower()));
        System.out.println(car.toString());
    }
}
