package CarShop;

public final class Audi extends BaseCar implements Rentable{
    protected double pricePerDay;
    protected int minRentableDay;

    public Audi(String model, String color, int horsePower,double pricePerDay,int minRentableDay) {
        super(model, color, horsePower);
        this.pricePerDay = pricePerDay;
        this.minRentableDay = minRentableDay;
    }

    @Override
    public int getMinRentDay() {
        return this.minRentableDay;
    }

    @Override
    public double getPricePerDay() {
        return this.pricePerDay;
    }
}
