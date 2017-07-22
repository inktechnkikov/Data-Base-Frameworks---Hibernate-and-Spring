package App;

import model.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashSet;
import java.util.Set;
@SpringBootApplication
public class ShampooCompany {
    public static void main(String[] args) {
        SpringApplication.run(ShampooCompany.class,args);
    }
}
