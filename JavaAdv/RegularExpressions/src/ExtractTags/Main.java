package ExtractTags;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Pattern pattern = Pattern.compile("<.+?>");
        String inputLine = reader.readLine();
        while (!inputLine.equals("END")) {
            Matcher matcher = pattern.matcher(inputLine);
            while (matcher.find()) {
                System.out.println(matcher.group());
                inputLine = reader.readLine();
            }
        }
    }
}