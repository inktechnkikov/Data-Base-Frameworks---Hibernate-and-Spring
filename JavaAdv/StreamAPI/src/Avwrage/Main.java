package Avwrage;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> tokens = Arrays.asList(reader.readLine().split("\\s+"));
           DoubleStream stream = tokens.stream().mapToDouble(Double::parseDouble);
        OptionalDouble res = stream.average();
        System.out.println(String.format("%.2f",res.getAsDouble()));
    }
}
