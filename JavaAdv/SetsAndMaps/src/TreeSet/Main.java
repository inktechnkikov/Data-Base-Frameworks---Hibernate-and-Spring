package TreeSet;


import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //Alphabetical order
        TreeSet<String> data = new TreeSet<>();
        data.add("Stamat");
        data.add("Angel");
        data.add("Gancho");
        data.add("Georgi");
        data.add("Alice");
        for (String datum : data) {
            System.out.println(datum);
        }
    }
}
