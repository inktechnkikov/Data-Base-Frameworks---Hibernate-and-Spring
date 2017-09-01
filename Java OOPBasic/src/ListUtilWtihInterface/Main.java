package ListUtilWtihInterface;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ListUtil listUtil = new ListUtil(5);
        listUtil.addNumbers();
        listUtil.printNumbers();
        listUtil.getMinNumber();
       listUtil.getMaxNumber();
        listUtil.sumOfNumbers();
    }
}
