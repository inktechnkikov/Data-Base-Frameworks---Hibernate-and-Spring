package springdataautomaping.Terminal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import springdataautomaping.Entities.Address;
import springdataautomaping.Entities.Employee;
import springdataautomaping.Service.ServiceEmployee;

import java.math.BigDecimal;
import java.util.Date;

@Controller
public class Terminal implements CommandLineRunner {

    private final ServiceEmployee serviceEmployee;
    @Autowired
    public Terminal(ServiceEmployee serviceEmployee){
        this.serviceEmployee = serviceEmployee;
    }
    @Override
    public void run(String... strings) throws Exception {
       // Address plovdiv = new Address("Plovdiv");
        Employee employee = new Employee("Stamat","Dobrev", BigDecimal.valueOf(1125.25),new Date());
        serviceEmployee.persist(employee);
    }
}
