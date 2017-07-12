package Inhretirtance;


public class Dog extends Animal{
    private String breed;
    public Dog(int age, String height,String breed) {
        super(age, height);
        this.breed = breed;
    }
    private String getBreed(){
        return this.breed;
    }
    protected void bark(){
        System.out.println("barking...");
    }
    protected String printBreed(){
       String breed = "Breed " + this.getBreed();
        System.out.println(breed);
       return breed;
    }
}
