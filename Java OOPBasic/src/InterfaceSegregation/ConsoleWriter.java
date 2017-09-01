package InterfaceSegregation;

public class ConsoleWriter implements Writer{
    @Override
    public void printMsg(String msg) {
        System.out.println(msg);
    }
}
