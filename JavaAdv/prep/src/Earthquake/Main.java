package Earthquake;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(n.readLine());
        List<Integer> waves = new ArrayList<>();
        Deque<Deque<Integer>> activities = new ArrayDeque<>();
        for (int i = 0; i < number; i++) {
            int[] currentWave = Stream.of(n.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            Deque<Integer> currentSeism = new ArrayDeque<>();
            for (int currentW : currentWave) {
                currentSeism.add(currentW);
            }
            activities.add(currentSeism);
        }
        int seismAmount = 0;
        while (!activities.isEmpty()){
            Deque<Integer> currentSeism = activities.pop();
            int seism = currentSeism.pop();
            seismAmount++;
            int lenght = currentSeism.size();
            for (int i = 0; i < lenght; i++) {
                int takeNextSeism = currentSeism.pop();
                if(seism < takeNextSeism){
                    currentSeism.push(takeNextSeism);
                    activities.add(currentSeism);
                    break;
                }
            }
            waves.add(seism);
        }
        StringBuilder res = new StringBuilder();
        res.append(seismAmount).append("\r\n");
        for (Integer wave: waves) {
            res.append(wave).append(" ");
        }
        System.out.println(res);
    }
}
