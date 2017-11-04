package StreamAPI.BookStore;


import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BookStore {
    public static void main(String[] args) {
        Stream<Book> books = Stream.of(new Book("Thinking in Java","Bruce Eckel",12.5),
                new Book(
                "Programming Basic with Java","Svetlin Nakov",10.00),
                new Book("Computer Network",
                "Dug Lou",12.5),
                new Book("Programming Basic with C#","Svetlin Nakov",10.00));
           Map<String,Double> bookCollection = books.collect(Collectors.groupingBy(Book::getAuthor,
                   Collectors.summingDouble(Book::getPrice)));
           bookCollection.entrySet().stream().sorted(Map.Entry.<String,Double>comparingByValue()
                   .reversed()
            .thenComparing(Map.Entry.<String,Double>comparingByKey()))
                   .forEach(stringDoubleEntry -> System.out.println(stringDoubleEntry));
    }
}
