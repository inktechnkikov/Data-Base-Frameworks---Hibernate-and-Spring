package ListUtilWtihInterface;
import java.io.IOException;



public interface ListService {

    void addNumbers() throws IOException;
    void printNumbers();
    int getMinNumber();
    int getMaxNumber();
    int sumOfNumbers();
}
