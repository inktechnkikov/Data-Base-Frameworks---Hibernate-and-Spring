package Polymorphism.MathOperation;

public class Main {
    public static void main(String[] args) {
        MathOp mathOp = new MathOp();
        int resWithTwoParams = mathOp.add(2,2);
        int resWithThreeParams = mathOp.add(1,2,3);
        System.out.println(resWithTwoParams);
        System.out.println(resWithThreeParams);
    }
}
