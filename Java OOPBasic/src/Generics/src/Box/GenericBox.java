package Generics.src.Box;

import java.util.ArrayList;
import java.util.List;

public class GenericBox<E> {
   private List<E> data;
    public GenericBox(){
        this.data = new ArrayList<>();
    }
    public void addElement(E element){
        this.data.add(element);
    }
    public void deleteElementAtpos(int pos){
        this.data.remove(pos);
    }
    public void printElements(){
        for (int i = 0; i < this.data.size(); i++) {
            System.out.println(this.data.get(i));
        }
    }
}
