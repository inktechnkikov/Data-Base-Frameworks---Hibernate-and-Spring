package ListMetods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        List<Integer> data = addNumbers(num);
        printNumbers(data);
        calc(data);
        getMaxNumber(data);
        getMinNumber(data);
    }
    public static List<Integer> addNumbers(int num) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> data = new ArrayList<>(num);
        for (int i = 0; i < num; i++) {
            int a = Integer.parseInt(reader.readLine());
            data.add(a);
        }
        return data;
    }
    public static void printNumbers(List<Integer> store){
        for (Integer integer : store) {
            System.out.println(integer);
        }
    }
    public static int calc(List<Integer> store){
        int sum = 0;
        for (int i = 0; i < store.size(); i++) {
            sum+=store.get(i);
        }
        System.out.println(sum);
        return sum;
    }
    public static void getMaxNumber(List<Integer> store){
        System.out.println(store.stream().max(Integer::compareTo).get());
    }
    public static void getMinNumber(List<Integer> store){
        System.out.println(store.stream().min(Integer::compareTo).get());
    }

}
