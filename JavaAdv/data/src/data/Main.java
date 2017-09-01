package data;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);
        String cards = scanInput.nextLine();

        if (cards.length() == 0) {
            System.out.println("No input");
            return;
        }

        String[] cardsArray = cards.split("\\s");
        int amount = 0;
        int cardsOfEqualType = 0; // keeps the count of the same dye cards
        int groupSum = 0; // keeps sum of the same dye cards
        CardDye lastDye = null;
        for (int index = 0; index < cardsArray.length; index++) {

            String card = cardsArray[index];

            boolean last = index == cardsArray.length - 1;

            String dyeStr = card.substring(card.length() - 1);
            CardDye currentDye = CardDye.valueOf(dyeStr);

            String cardFace = card.substring(0, card.length() - 1);
            CardFace face = CardFace.get(cardFace);

            if (lastDye == null) {
                lastDye = currentDye;
                groupSum += face.getPoints();
                cardsOfEqualType++;

                amount = sumGroup(amount, cardsOfEqualType, groupSum, last);
            } else {
                if (lastDye == currentDye) {
                    groupSum += face.getPoints();
                    cardsOfEqualType++;

                    amount = sumGroup(amount, cardsOfEqualType, groupSum, last);

                } else {
                    // sum last group with the same dye
                    lastDye = currentDye;
                    amount += groupSum * cardsOfEqualType;

                    // clear the group variables
                    groupSum = 0;
                    cardsOfEqualType = 0;

                    // add current to the group
                    groupSum += face.getPoints();
                    cardsOfEqualType++;

                    amount = sumGroup(amount, cardsOfEqualType, groupSum, last);
                }
            }

        }

        System.out.println(amount);

    }
    private static int sumGroup(int amount, int cardsOfEqualType, int groupSum, boolean last) {
        if (last) {
            amount += groupSum * cardsOfEqualType;
        }
        return amount;
    }

    public class Card {

        private CFace face;
        private Dye dye;

        public Card(CFace face, Dye dye) {
            this.face = face;
            this.dye = dye;
        }
    }

    public enum CardDye implements Dye {
        S("S"),
        H("H"),
        D("D"),
        C("C");

        private String prefix;

        CardDye(String prefix) {
            this.prefix = prefix;
        }

        @Override
        public String getPrefix() {
            return prefix;
        }
    }

    public enum CardFace implements CFace {

        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        J(12),
        Q(13),
        K(14),
        A(15);

        CardFace(int points) {
            this.points = points;
        }

        private int points;

        public int getPoints() {
            return points;
        }

        public static CardFace get(String name) {
            switch (name) {
                case "2":
                    return TWO;
                case "3":
                    return THREE;
                case "4":
                    return FOUR;
                case "5":
                    return FIVE;
                case "6":
                    return SIX;
                case "7":
                    return SEVEN;
                case "8":
                    return EIGHT;
                case "9":
                    return NINE;
                case "10":
                    return TEN;
                default:
                    return CardFace.valueOf(name);
            }
        }
    }

    public interface CFace {

        public int getPoints();
    }

    public interface Dye {

        public String getPrefix();
    }
}