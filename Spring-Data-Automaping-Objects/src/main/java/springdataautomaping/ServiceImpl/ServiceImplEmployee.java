package springdataautomaping.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springdataautomaping.Entities.Employee;
import springdataautomaping.Repos.EmployeeRepository;
import springdataautomaping.Service.ServiceEmployee;

@Service
public class ServiceImplEmployee implements ServiceEmployee{
   private final EmployeeRepository employeeRepository;

   @Autowired
   public ServiceImplEmployee(EmployeeRepository employeeRepository){
       this.employeeRepository = employeeRepository;
   }

    @Override
    public void persist(Employee employee) {
        this.employeeRepository.save(employee);
    }
}
