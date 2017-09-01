package Demo;

public class Container<i1,i2> {
   private i1 item1;
   private i2 item2;

    public Container(i1 item1,i2 item2){
       this.item1 = item1;
       this.item2 = item2;
    }
    public void printItem(){
        System.out.println("Printing contents of container");
        System.out.println("Item1 -> " + item1);
        System.out.println("Item2 -> " + item2);
    }
}
