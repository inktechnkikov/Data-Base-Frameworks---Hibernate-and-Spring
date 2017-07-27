package springdataseconddemo.Services;

import springdataseconddemo.Entities.Car;

public interface ServiceCar {
    void persist(Car car);
    void searchByBrand();
    void searchByEngineType();
    void searchByBrandAndPrice();
}
