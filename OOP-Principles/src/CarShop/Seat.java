package CarShop;
public final class Seat extends BaseCar implements Sellable{

    private String countryProduced;
    private double price;
    public Seat(String model,String color,int horsePower,String countryProduced,double price){
        super(model,color,horsePower);
        this.countryProduced = countryProduced;
        this.price = price;
    }
    @Override
    public String toString() {
        return "This is " + this.model + " and is " + this.color + " with " + this.horsePower + "HP and is produced in "
                + this.countryProduced + " with " + TIRES + " tires";
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
