package Controller;

/**
 *
 * @author grom2209
 */
public class User {
    String username;
    String password;
    Boolean online;
    //List<Group> subscribedGroup
    
    public User(String usern, String pwd){
        this.username = usern;
        this.password = pwd;
    }
    
}
