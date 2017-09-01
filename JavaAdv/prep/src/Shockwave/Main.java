package Shockwave;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] size = reader.readLine().split("\\s+");
        int rows = Integer.parseInt(size[0]);
        int cols = Integer.parseInt(size[1]);
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = 0;
            }
        }
        String command = reader.readLine();
        while (!command.equals("Here We Go")){
            String[] inputs = command.split("\\s+");
            int x1 = Integer.parseInt(inputs[0]);
            int y1 = Integer.parseInt(inputs[1]);
            int x2 = Integer.parseInt(inputs[2]);
            int y2 = Integer.parseInt(inputs[3]);
            for (int row = x1; row <= x2; row++) {
                for (int col = y1; col <= y2; col++) {
                    matrix[row][col]++;
                }
            }
            command = reader.readLine();
        }
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
