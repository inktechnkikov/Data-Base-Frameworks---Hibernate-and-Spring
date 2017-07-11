package DAOPattern.EntityManager;

import DAOPattern.connection.ConnectionManager;
import DAOPattern.interfaces.DbContext;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.SQLException;

public class EntityManager implements DbContext {

    private Connection connection;
    public EntityManager() throws SQLException {
        connection = ConnectionManager.getConnection();
    }
    @Override
    public <E> boolean persist(E entity) throws IllegalAccessException, SQLException {
        String tableName = entity.getClass().getSimpleName().toLowerCase();
        String createTableQuery = "CREATE TABLE IF NOT EXISTS " + tableName + "("
                + "id INT AUTO_INCREMENT PRIMARY KEY, ";
        Field[] fields = entity.getClass().getDeclaredFields();
        String columns = " ";
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
                String fildName = field.getName();
                if(!fildName.equals("id")){
                    columns += fildName;
                }
        }
        return true;
    }

    @Override
    public void closeConnection() {

    }
}
