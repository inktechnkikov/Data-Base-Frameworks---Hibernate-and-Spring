package MatchCount;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Pattern pattern = Pattern.compile(reader.readLine());
        Matcher matcher = pattern.matcher(reader.readLine());
        int countMatches = 0;
        while (matcher.find()){
            countMatches++;
        }
        System.out.println(String.format("Matches - %s",countMatches));
    }
}
