package CountSameValuesInArr;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        HashMap<String,Integer> data = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            if(!data.containsKey(input[i])){
                data.put((input[i]),1);
            }else{
                data.put((input[i]),data.get(input[i]) + 1);
            }
        }
        for (String res : data.keySet()) {
            System.out.println(res + " - " + data.get(res) + " times");
        }
    }
}
