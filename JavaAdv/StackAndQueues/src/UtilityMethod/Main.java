package UtilityMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        ArrayDeque<String> data = new ArrayDeque<>();
        addElementToStack(input,data);
        getSize(data);
        popElement(data);
        getSize(data);

    }
    public static void addElementToStack(String element,ArrayDeque<String> data){
        data.push(element);
    }
    public static void getSize(ArrayDeque<String> data){
        System.out.println(data.size());
    }
    public static String popElement(ArrayDeque<String>data){
        return data.pop();
    }
}
