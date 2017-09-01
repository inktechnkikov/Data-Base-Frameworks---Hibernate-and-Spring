package SoftUniParty;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> regularGuests = new HashSet<>();
        TreeSet<String> vipGuests = new TreeSet<>();
        while (true){
            String input = reader.readLine();
            if(input.equals("PARTY")){
                break;
            }else if(!Character.isDigit(input.charAt(0))){
                regularGuests.add(input);
            }else{
                vipGuests.add(input);
            }
        }
        while (true){
            String input = reader.readLine();
            if(input.equals("END")){
                break;
            }else if(Character.isDigit(input.charAt(0))){
                vipGuests.remove(input);
            }else{
                regularGuests.remove(input);
            }
        }
        vipGuests.addAll(regularGuests);
        System.out.println(vipGuests.size());
        for (String vipGuest : vipGuests) {
            System.out.println(vipGuest);
        }
    }
}
