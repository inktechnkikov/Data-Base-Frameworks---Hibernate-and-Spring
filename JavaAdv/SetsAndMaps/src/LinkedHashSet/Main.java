package LinkedHashSet;


import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> data = new LinkedHashSet<>();
        data.add("Pesho");
        data.add("Gosho");
        data.add("Alice");
        data.add("Pesho");
        for (String datum : data) {
            System.out.println(datum);
        }
    }
}
