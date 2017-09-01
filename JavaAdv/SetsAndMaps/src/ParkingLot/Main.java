package ParkingLot;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> parking = new HashSet<>();
        while (true) {
            String direction = input.readLine();
            String[] commandHolder = direction.split(", ");
            if (commandHolder[0].equals("IN")) {
                parking.add(commandHolder[1]);
            } else if(commandHolder[0].equals("OUT")) {
                parking.remove(commandHolder[1]);
            }
            if(direction.equals("END")){
                break;
            }
        }
        if(parking.isEmpty()){
            System.out.printf("Parking Lot is Empty");
        }else{
            for (String cars : parking) {
                System.out.println(cars);
            }
        }
    }
}