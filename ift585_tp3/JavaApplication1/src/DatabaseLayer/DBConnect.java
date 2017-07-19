package DatabaseLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Defalt
 */
public class DBConnect implements DBConnect_interface{
    final String dbName = "IFT585_tp3";
    final String hostname = "localhost";
    final int portNb = 5432;
    String username = "postgres";
    String password = "qw1029zxADMIN";
    Connection conn;
    
    
    public DBConnect() throws SQLException {
       String url = "jdbc:postgresql://localhost:5432/" + dbName;
       conn = DriverManager.getConnection(url, username, password);
    }
    
    @Override
    public void createUser(String username, String password) throws SQLException{
        // NEED TO REPLACE WITH STRINGBUILDER, but for now, who cares...
        String id = "US0000";
        String pp = "INSERT INTO public.userTable VALUES (";
        pp += "'" + id + "'";
        pp += ", ";
        pp += "'" + username + "'";
        pp += ", ";
        pp += "'" + password + "'";
        pp += ");";
        
        try {
            PreparedStatement ps = conn.prepareStatement(pp);
            ps.executeUpdate();
            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
