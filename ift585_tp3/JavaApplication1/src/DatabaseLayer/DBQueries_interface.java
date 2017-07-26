package DatabaseLayer;

import Main.User;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Defalt
 */
public interface DBQueries_interface {
    
    public void createUser(String username, String password) throws SQLException;
    public User retrieveUser(String username) throws SQLException;
    public List<User> retrieveAllUsers() throws SQLException;
    public List<User> retrieveAllOnlineUsers() throws SQLException;
    public void setUserOnline(String username) throws SQLException;
    public void setUserOffline(String username) throws SQLException;
}
