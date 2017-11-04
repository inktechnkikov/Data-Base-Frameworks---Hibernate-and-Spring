package DocumentProp;

public class Main {
    public static void main(String[] args) {
    Printable document = new Document();
    document.print();
    ReadableDoc read = new Document();
    read.read();
    }
}
