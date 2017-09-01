package ArraysDemo;

public class StringArr {
    public static void main(String[] args) {
        String[] StringArr = {"Pepo","Stamat","Katya"};
        for (int i = 0; i < StringArr.length; i++) {
            System.out.printf("name[%d] - %s%n",i,StringArr[i]);
        }
        String firstElement = StringArr[0];
        String secondElement = StringArr[1];
        String thirdElement = StringArr[2];
        String[] newArr = {thirdElement,secondElement,firstElement};
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}
