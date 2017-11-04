package DAOPattern;

import DAOPattern.EntityManager.EntityManager;
import DAOPattern.interfaces.DbContext;
import DAOPattern.model.User;

import java.sql.SQLException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws SQLException, IllegalAccessException {
        DbContext entityManager = new EntityManager();
      try {
          User user1 = new User("Stmat",25,LocalDate.now());
          entityManager.persist(user1);
      }finally {
          entityManager.closeConnection();
      }
    }
}
