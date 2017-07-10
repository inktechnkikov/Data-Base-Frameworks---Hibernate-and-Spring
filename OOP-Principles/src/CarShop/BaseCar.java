package CarShop;

public abstract class BaseCar implements Car{
    protected String model;
    protected String color;
    protected int horsePower;

    public BaseCar(String model,String color,int horsePower){
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public int getHorsePower() {
        return this.horsePower;
    }

}
