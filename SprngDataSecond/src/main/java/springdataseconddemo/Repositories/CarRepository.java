package springdataseconddemo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springdataseconddemo.Entities.Car;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car,Long>{
    List<Car> findCarByBrand(String brand);
    List<Car> findCarByEngineType(String engineType);
    List<Car> findCarByBrandAndPrice(String brand,Double price);
}
