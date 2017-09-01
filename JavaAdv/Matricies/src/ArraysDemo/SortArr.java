package ArraysDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortArr {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(reader.readLine());
        String[]collection = new String[length];
        for (int i = 0; i < collection.length; i++) {
            collection[i] = reader.readLine();
        }
        Arrays.sort(collection);
        for (String s : collection) {
            System.out.println(s);
        }
    }
}
