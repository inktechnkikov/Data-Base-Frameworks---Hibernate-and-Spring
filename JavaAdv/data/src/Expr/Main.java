package Expr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        Stack<Integer> data = new Stack<>();
        Pattern pattern = Pattern.compile("-?\\d+");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){

        }


    }
}
