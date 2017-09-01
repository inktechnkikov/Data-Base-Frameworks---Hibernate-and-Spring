package inheritance;


public class Animal {
    private int age;
    private String gender;
    private int weight;

    public Animal(int age,String gender,int weight){
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }
    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("ZzzZzz");
    }
}
