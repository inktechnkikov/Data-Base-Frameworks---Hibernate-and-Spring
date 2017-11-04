package Entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Teachers")
public class Teachers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "First_Name")
    private String name;
    @Column(name = "Registration_Date")
    private LocalDate registrationDate;

    public Teachers(String name,LocalDate registrationDate){
        this.name = name;
        this.registrationDate = registrationDate;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public LocalDate getRegistrationDate() {
        return this.registrationDate;
    }
}
