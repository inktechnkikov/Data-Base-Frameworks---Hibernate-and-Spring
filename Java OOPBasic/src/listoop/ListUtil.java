package listoop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ListUtil {
   private int size;
   private List<Integer> data = new ArrayList<>();

   public ListUtil(int size){
       this.size = size;
   }
   public void addNumber() throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       for (int i = 0; i < this.size; i++) {
           int a = Integer.parseInt(reader.readLine());
           this.data.add(a);
       }
   }
   public void printNumbersInCollection(){
       for (int i = 0; i < this.data.size(); i++) {
           System.out.println(this.data.get(i));
       }
   }
   public int getMaxNumber(){
      // System.out.println(this.data.stream().max(Integer::compareTo).get());
       int maxNumber = this.data.indexOf(0);
       for (int i = 0; i < this.data.size(); i++) {
           if(this.data.get(i) > maxNumber){
               maxNumber = this.data.get(i);
           }
       }
       System.out.println("Max number is " + maxNumber);
       return maxNumber;
   }
   public int getMinNumber(){
       int minNumber = this.data.get(0);
       for (int i = 0; i < this.data.size(); i++) {
           if(this.data.get(i) < this.data.get(i)){
               minNumber = this.data.get(i);
           }
       }
       System.out.println("min number si " + minNumber);
       return minNumber;
   }

}
