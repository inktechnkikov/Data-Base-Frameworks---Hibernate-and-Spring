package StreamAPI.Demo;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class UpperStr {
    public static void main(String[] args) throws IOException {
      String[] data = toUppersString();
    }
   public static String[] toUppersString() throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String[] inp = reader.readLine().split("\\s+");
       Arrays.stream(inp).map(s -> s.toUpperCase()).forEach(s -> System.out.print(s + " "));
       return inp;
   }
}
