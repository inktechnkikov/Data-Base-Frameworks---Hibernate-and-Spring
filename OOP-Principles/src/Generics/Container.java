package Generics;


public class Container {

    public static <E> void printArr(E[] inputArr){
        for (E element : inputArr) {
            System.out.printf("%s",element);
        }
        System.out.println();
    }
}
