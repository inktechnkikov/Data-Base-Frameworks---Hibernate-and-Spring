package ArraysDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        for (int number : numbers) {
            System.out.printf("%s ",number);
        }
        System.out.println(numbers[2]);
    }
}
