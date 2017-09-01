package DemoHashSet;


import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        //This collection will add elements by added order
        HashSet<String> data = new HashSet<>();
        data.add("Stamat");
        data.add("Georgi");
        data.add("Lubo");
        data.add("Stamat");
        for (String datum : data) {
            System.out.println(datum);
        }
        System.out.println();
        data.remove("Georgi");
        for (String datum : data) {
            System.out.println(datum);
        }
    }
}
