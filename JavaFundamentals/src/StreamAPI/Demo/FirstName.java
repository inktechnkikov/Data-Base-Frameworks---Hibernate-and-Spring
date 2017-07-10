package StreamAPI.Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Optional;

public class FirstName {
    public static void main(String[] args) throws IOException {
        String[] names = printFirstName();
    }
    public static String[] printFirstName() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] names = reader.readLine().split("\\s+");
        char firstLetter = reader.readLine().toUpperCase().charAt(0);
       Optional<String> data =  Arrays.stream(names).filter(s -> s.toUpperCase().charAt(0) == firstLetter)
               .sorted().findFirst();
       if(data.isPresent()){
           System.out.println(data.get());
       }else{
           System.out.println("No match");
       }
        return names;
    }
}
