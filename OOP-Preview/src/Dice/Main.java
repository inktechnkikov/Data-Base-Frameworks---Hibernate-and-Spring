package Dice;

public class Main {
    public static void main(String[] args) {
        Dice firstDice = new Dice(6,"Black");
        Dice secondDice = new Dice(8,"White");
        firstDice.diceInformation();
        secondDice.diceInformation();
        for (int i = 0; i < 20; i++) {
            System.out.printf("%d ",firstDice.roll());
        }
        System.out.println();
        for (int i = 0; i < 20; i++) {
            System.out.print(secondDice.roll() + " ");
        }
    }
}
