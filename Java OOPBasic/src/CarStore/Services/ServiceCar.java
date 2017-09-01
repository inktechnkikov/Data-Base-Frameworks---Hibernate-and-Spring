package CarStore.Services;

import CarStore.Entities.Car;

public interface ServiceCar {
    void saveToStore(Car car);
    void searchByBrand(String brand);
    void searchByEngineType(String engineType);
}
