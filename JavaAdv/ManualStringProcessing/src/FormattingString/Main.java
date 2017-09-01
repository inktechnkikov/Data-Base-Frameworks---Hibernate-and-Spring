package FormattingString;

public class Main {
    public static void main(String[] args) {
        String result = String.format("One: %1$f Two: %2$f",1.0,2.0);
        String result1 = String.format("Two : %1$d One: %2$d",20,10);
        System.out.println(result);
        System.out.println(result1);
    }
}
