package TreeMap;


import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String,String> phoneNumber = new TreeMap<>();
        phoneNumber.put("Alice","0898555441");
        phoneNumber.put("Pesho","55889902");
        phoneNumber.put("Arnold","14788-00-56");
        for (String nubers : phoneNumber.keySet()) {
            System.out.println("name - " + nubers + "; phone number - " + phoneNumber.get(nubers));
        }
    }
}
