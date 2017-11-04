package springdataautomaping.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class EmployeeDto implements Serializable{

    private String firstName;
    private String lastName;
    private BigDecimal salary;
    private String addressCity;

    public EmployeeDto(){

    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BigDecimal getSalary() {
        return this.salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getAddressCity() {
        return this.addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }
}
