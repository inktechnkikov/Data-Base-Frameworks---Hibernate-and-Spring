package StreamAPI.BookStore;


public class Book {
    private String name;
    private String author;
   private double price;

    public Book(String name,String author,double price){
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public String getName(){
        return this.name;
    }
    public String getAuthor(){
        return this.author;
    }
    public double getPrice(){
        return this.price;
    }
}
