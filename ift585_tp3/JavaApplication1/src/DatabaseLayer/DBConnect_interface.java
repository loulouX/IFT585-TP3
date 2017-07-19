package DatabaseLayer;

import java.sql.SQLException;

/**
 *
 * @author Defalt
 */
public interface DBConnect_interface {
    public void createUser(String username, String password) throws SQLException;
}
