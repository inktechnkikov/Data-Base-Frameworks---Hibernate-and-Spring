package DocumentProp;

public class Document implements Printable, ReadableDoc {
    @Override
    public void print() {
        System.out.println("Hello.Im a print method");
    }

    @Override
    public void read() {
        System.out.println("Hello im a read method");
    }
}
