import Entities.Teachers;

import javax.persistence.*;
import java.sql.SQLException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws SQLException {
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("test-db");
        EntityManager manager = managerFactory.createEntityManager();
        manager.getTransaction().begin();
        Teachers firstTeacher = new Teachers("John", LocalDate.now());
        Teachers secondTeacher = new Teachers("Raynold",LocalDate.now());
        Teachers thirdTeacher = new Teachers("Wayne",LocalDate.now());
        manager.persist(firstTeacher);
        manager.persist(secondTeacher);
        manager.persist(thirdTeacher);
        manager.getTransaction().commit();

    }
}
