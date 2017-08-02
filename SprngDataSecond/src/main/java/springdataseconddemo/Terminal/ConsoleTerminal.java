package springdataseconddemo.Terminal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import springdataseconddemo.Entities.Car;
import springdataseconddemo.Services.ServiceCar;

@Controller
public class ConsoleTerminal implements CommandLineRunner{

    private final ServiceCar serviceCar;
    @Autowired
    public ConsoleTerminal(ServiceCar serviceCar) {
        this.serviceCar = serviceCar;
    }

    @Override
    public void run(String... strings) throws Exception {
        Car car = new Car();
        car.setBrand("Mercedes");
        car.setModel("E");
        car.setHorsePower(100);
        car.setEngineType("diesel");
        car.setPrice(10.700);
        serviceCar.persist(car);
        Car car1 = new Car();
        car1.setBrand("BMW");
        car1.setModel("5 series");
        car1.setHorsePower(150);
        car1.setEngineType("benzin");
        car1.setPrice(8.500);
        Car audi = new Car();
        audi.setBrand("Audi");
        audi.setModel("A6");
        audi.setHorsePower(145);
        audi.setEngineType("diesel");
        audi.setPrice(9.500);
        serviceCar.persist(car);
        serviceCar.persist(car1);
        serviceCar.persist(audi);
       // serviceCar.searchByBrand();
        serviceCar.searchByEngineType();
     //   serviceCar.searchByBrandAndPrice();

    }
}
