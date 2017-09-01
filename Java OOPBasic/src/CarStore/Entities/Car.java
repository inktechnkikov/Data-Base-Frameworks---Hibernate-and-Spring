package CarStore.Entities;

public class Car {
    private String brand;
    private String model;
    private int horsePowers;
    private String engineType;

    public Car(String brand,String model,int horsePowers,String engineType){
        this.brand = brand;
        this.model = model;
        this.horsePowers = horsePowers;
        this.engineType = engineType;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePowers() {
        return this.horsePowers;
    }

    public void setHorsePowers(int horsePowers) {
        this.horsePowers = horsePowers;
    }

    public String getEngineType() {
        return this.engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}
