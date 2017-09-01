package SimpleCalc;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = reader.readLine().split("\\s+");
        ArrayDeque<String> data = new ArrayDeque<>();
        for (int i = 0; i < tokens.length; i++) {
            data.add(tokens[i]);
        }
        while (data.size() > 1){
            int firstElement = Integer.parseInt(data.pop());
            String operator = data.pop();
            int secondElement = Integer.parseInt(data.pop());
            if(operator.equals("+")){
                String res = String.valueOf(firstElement + secondElement);
                data.push(res);
            }else{
                String res = String.valueOf(firstElement - secondElement);
                data.push(res);
            }
        }
        System.out.println(data.pop());
    }
}
