package AssociativeArrays;


import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> hashData = new HashMap<>();
        hashData.put("Stamat","055864");
        hashData.put("Pesho","554477-00");
        hashData.put("Joseph","55-00-989");
        for (String s : hashData.keySet()) {
            System.out.println(s + " number -> " + hashData.get(s));
        }
    }
}
