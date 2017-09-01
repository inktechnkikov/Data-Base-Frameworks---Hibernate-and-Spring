package MultidimensionalArrays;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumElementInMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] delimeter = reader.readLine().split(", ");
        int[][] numbers = new int[Integer.parseInt(delimeter[0])][Integer.parseInt(delimeter[1])];

        for (int row = 0; row < numbers.length; row++) {
            String[] rowNum = reader.readLine().split(", ");
            for (int col = 0; col < numbers[row].length; col++) {
                numbers[row][col] = Integer.parseInt(rowNum[col]);
            }
        }
        System.out.println(numbers.length);
        System.out.println(numbers[0].length);
        int sum = 0;
        for (int[] number : numbers) {
            for (int i : number) {
                sum += i;
                System.out.print(i + " ");
            }
        }
        System.out.println(sum);
    }
}
