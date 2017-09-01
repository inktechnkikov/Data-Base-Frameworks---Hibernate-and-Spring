package CarStore.ServiceImpl;

import CarStore.Entities.Car;
import CarStore.Services.ServiceCar;

import java.util.ArrayList;
import java.util.List;

public class Store implements ServiceCar{
    private List<Car> carList = new ArrayList<>();
    private Car cars;
    @Override
    public void saveToStore(Car car) {
        this.carList.add(car);
    }

    @Override
    public void searchByBrand(String brand) {
        for (int i = 0; i < this.carList.size(); i++) {
            if(brand.contains("Mercedes")){
                System.out.println("Correct" + cars.getBrand());
            }else{
               throw new IllegalArgumentException("No such brand");
            }
        }
    }

    @Override
    public void searchByEngineType(String engineType) {
        for (int i = 0; i < this.carList.size(); i++) {
            if(engineType.contains("Diesel")){
                System.out.println("Correct");
            }else{
                throw new IllegalArgumentException("No such engine");
            }
        }
    }

}
