package DAOPattern.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionManager {

    private static final String DBconnection = "jdbc:mysql://localhost:3306/test-db";
    private static final String USERNAME = "nkikov";
    private static final String PASS = "nkikov";

    public static Connection getConnection() throws SQLException {
       return DriverManager.getConnection(DBconnection,USERNAME,PASS);
    }
}
