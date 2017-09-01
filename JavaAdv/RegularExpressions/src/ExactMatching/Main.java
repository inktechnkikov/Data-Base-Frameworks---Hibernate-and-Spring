package ExactMatching;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("a");
        Matcher matcher = pattern.matcher("Java");
        while (matcher.find()){
            System.out.print(matcher.group() + " ");
        }
    }
}
