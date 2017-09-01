package ListUtilWtihInterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ListUtil implements ListService{
    private int size;
    private List<Integer> data = new ArrayList<>();
    public ListUtil(int size){
        this.size = size;
    }

    @Override
    public void addNumbers() throws IOException {
        //int sum = 0;
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <= this.size; i++) {
            int n = Integer.parseInt(reader.readLine());
            this.data.add(n);
           // sum+=i;
        }
      //  this.data.add(sum);
    }
    @Override
    public void printNumbers() {
        for (int i = 0; i < this.data.size(); i++) {
            System.out.println(this.data.get(i));
        }
    }

    @Override
    public int getMinNumber() {
       int minNum = this.data.get(0);
        for (int i = 0; i < this.data.size(); i++) {
            if (this.data.get(i) < minNum){
                minNum = this.data.get(i);
            }
        }
        System.out.printf("the min number is %s%n",minNum);
        return minNum;
    }

    @Override
    public int getMaxNumber() {
       int max = this.data.stream().max(Integer::compareTo).get();
        System.out.printf("the max number is %s%n",max);
        return max;
    }

    @Override
    public int sumOfNumbers() {
        int sum = 0;
        for (int i = 0; i < this.data.size(); i++) {
            sum+=this.data.get(i);
        }
        System.out.printf("Sum of all numbers is %s",sum);
        return sum;
    }


}
