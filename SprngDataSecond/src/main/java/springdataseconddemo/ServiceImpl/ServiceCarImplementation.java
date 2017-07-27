package springdataseconddemo.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springdataseconddemo.Entities.Car;
import springdataseconddemo.Repositories.CarRepository;
import springdataseconddemo.Services.ServiceCar;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ServiceCarImplementation implements ServiceCar{

    private final CarRepository carRepository;

    @Autowired
    public ServiceCarImplementation(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    @Override
    public void persist(Car car) {
        this.carRepository.save(car);
    }

    @Override
    public void searchByBrand() {
        List<Car> carList = this.carRepository.findCarByBrand("Mercedes");
        for (Car car : carList) {
            System.out.println(car.getBrand());
        }
    }
    @Override
    public void searchByEngineType() {
        List<Car> carList = this.carRepository.findCarByEngineType("diesel");
        for (Car car : carList) {
            System.out.println(car.getEngineType());
        }
    }

    @Override
    public void searchByBrandAndPrice() {
        List<Car> carList = this.carRepository.findCarByBrandAndPrice("Mercedes",10.7);
        for (Car car : carList) {
            System.out.printf("Brand %s,price %.2f%n",car.getBrand(),car.getPrice());
        }
    }


}
