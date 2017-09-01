package CharacterClasses;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Pattern pattern = Pattern.compile("[aeiouy]");
        Matcher matcher = pattern.matcher("Abraham Lincoln");
        int matches = 0;
        while (matcher.find()){
            matches++;
        }
        System.out.println(String.format("%d Vowels",matches));
    }
}
