import Entities.Teachers;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.SQLException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws SQLException {
        String sqlSelect = "SELECT id,First_name,Registration_Date FROM teachers";

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
        manager.close();
    }
}
