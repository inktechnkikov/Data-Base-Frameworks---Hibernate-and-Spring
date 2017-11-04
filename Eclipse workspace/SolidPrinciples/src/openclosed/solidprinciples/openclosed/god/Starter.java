package openclosed.solidprinciples.openclosed.god;

public class Starter {
    public static void main(String[] args) {
   Greeter greeter = new Greeter(new CasualPersonality());
   		System.out.println(greeter.greet());
    }
}
