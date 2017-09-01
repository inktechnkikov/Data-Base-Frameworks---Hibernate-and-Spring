package QueueDemo;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Collections;

public class HotPotatoe {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] childres = reader.readLine().split("\\s+");
        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue,childres);

    }
}
