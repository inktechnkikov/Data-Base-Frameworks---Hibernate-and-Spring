package Arrays;


import java.util.Arrays;

public class SimpleArr {
    public static void main(String[] args) {
        int[] elements = {1,2,3,4};
        printElement(elements);
    }
    public static void printElement(int[] element){
        for (int i = 0; i < element.length; i++) {
            int elements = element[i];
            System.out.println(elements);
        }
    }
}
