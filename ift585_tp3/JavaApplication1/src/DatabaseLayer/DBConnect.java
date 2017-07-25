package DatabaseLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Defalt
 */
public class DBConnect{
    final String dbName = "IFT585_tp3";
    final String hostname = "localhost";
    final int portNb = 5432;
    String username = "postgres";
    String password = "admin";
    Connection conn;
    
    
    public DBConnect() throws SQLException {
       String url = "jdbc:postgresql://localhost:5432/" + dbName;
       conn = DriverManager.getConnection(url, username, password);
    }
    
    public Connection getConnection(){
        return this.conn;
    }
    
}
