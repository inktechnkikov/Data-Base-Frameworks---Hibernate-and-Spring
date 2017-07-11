import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        try(Connection testConnection = DriverManager.getConnection(DBConst.dbConnet,DBConst.usernName,DBConst.passWord)) {
            System.out.println("Connection successful");
            try(Statement statement = testConnection.createStatement()){
               String query = "CREATE TABLE IF NOT EXISTS teachers (" +
                       "id int AUTO_INCREMENT PRIMARY KEY," +
                       "username varchar(20)," + "password varchar(20))";
               statement.executeUpdate(query);

                String insertQuery = "INSERT INTO teachers (username,password) " +
                        "VALUES ('Ivan','123'), ('Gosho','222')";
                statement.executeUpdate(insertQuery);

            }
        }
    }
}
