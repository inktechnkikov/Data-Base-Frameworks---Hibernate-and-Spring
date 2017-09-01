package MultidimensionalArrays;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class JaggedArr {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(", ");
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(0,new ArrayList<>());
        matrix.add(1,new ArrayList<>());
        matrix.add(2,new ArrayList<>());
        for (String s : input) {
            int currentNumber = Integer.parseInt(s);
            matrix.get(Math.abs(currentNumber%3)).add(currentNumber);
        }
        for (ArrayList<Integer> integers : matrix) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }

    }
}
