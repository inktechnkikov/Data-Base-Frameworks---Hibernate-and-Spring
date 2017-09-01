package StackDemo;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
