package AcademyGraduation;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numOfStudents = Integer.parseInt(reader.readLine());
        TreeMap<String,Double> results = new TreeMap<>();
        for (int i = 0; i < numOfStudents; i++) {
            String nameOfStudent = reader.readLine();
            String[] scores = reader.readLine().split(" ");
            double totalScores = 0;
            for (String score : scores) {
                totalScores+= Double.parseDouble(score);
            }
            results.put(nameOfStudent,(totalScores / scores.length));
        }
        for (String key : results.keySet()) {
            System.out.println(key + " is graduated with " + results.get(key));
        }
    }
}
