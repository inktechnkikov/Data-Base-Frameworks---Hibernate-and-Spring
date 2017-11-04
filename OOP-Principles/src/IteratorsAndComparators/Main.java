package IteratorsAndComparators;


public class Main {
    public static void main(String[] args) {
      //  print();
      //  print("PEsho");
      //  print("Gosho","Doncho");
        String[] arr = {"First","Seconds","Third"};
        print(arr);
    }
    public static void print(String...varargs){
        if(varargs.length == 0) {
            System.out.println("No argument");
            return;
        }
        for (String vararg : varargs) {
            System.out.println(vararg);
        }
    }
}
