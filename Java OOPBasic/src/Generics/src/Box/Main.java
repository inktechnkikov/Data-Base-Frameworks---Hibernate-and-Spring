package Generics.src.Box;

public class Main {
    public static void main(String[] args) {
        GenericBox<Double> store = new GenericBox<>();
        store.addElement(1.2);
        store.addElement(1.3);
        store.addElement(20.5);
        store.addElement(14.25);
        store.addElement(77.3);
        store.printElements();
        System.out.println();
       // store.deleteElementAtpos(1);
        store.deleteElementAtpos(0);
        store.printElements();
    }
}
