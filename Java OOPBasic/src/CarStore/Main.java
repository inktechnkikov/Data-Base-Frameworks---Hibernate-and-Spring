package CarStore;


import CarStore.Entities.Car;
import CarStore.ServiceImpl.Store;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Mercedes","E-class",145,"Diesel");
        Store store = new Store();
        store.saveToStore(car);
        store.searchByBrand("Mercedes");
        store.searchByEngineType("Diesel");
    }
}
