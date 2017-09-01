package ConcatenatingStr;


public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hello");
        builder.append(" Java");
        System.out.println(builder.toString());
        System.out.println(builder.reverse());
    }
}
