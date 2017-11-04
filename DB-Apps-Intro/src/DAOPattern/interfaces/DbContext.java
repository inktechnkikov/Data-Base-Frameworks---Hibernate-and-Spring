package DAOPattern.interfaces;


import java.sql.SQLException;

public interface DbContext {
    <E> boolean persist(E entity) throws IllegalAccessException,SQLException;
    void closeConnection();
}
