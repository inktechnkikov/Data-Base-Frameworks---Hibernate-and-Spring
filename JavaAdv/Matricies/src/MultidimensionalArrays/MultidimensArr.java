package MultidimensionalArrays;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultidimensArr {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int rows = Integer.parseInt(reader.readLine());
        int cols = Integer.parseInt(reader.readLine());
        int[][]twoDim = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols;col++) {
                System.out.print(String.format("matrix[%s][%s]",row,col));
                  //  String input = reader.readLine();
                twoDim[row][col] = Integer.parseInt(reader.readLine());
            }
        }
    }
}
