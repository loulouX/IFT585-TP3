/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseLayer;

import Main.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Defalt
 */
public class DBQueries implements DBQueries_interface{
    Connection conn;
    
    public DBQueries(Connection conn){
        this.conn = conn;
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

    @Override
    public User retrieveUser(String username) throws SQLException {
        User user = new User();
        
        String pp = "SELECT username, password FROM public.users WHERE username = '";
        pp += username;
        pp += "';";
        
        PreparedStatement ps = conn.prepareStatement(pp);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));  
        }
        System.out.println(user.getUsername());
        
        return user;
    }
    
    @Override
    public List<User> retrieveAllUsers() throws SQLException {
        User user = new User();
        
        String pp = "SELECT username FROM public.users;";
        
        PreparedStatement ps = conn.prepareStatement(pp);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));  
        }
        System.out.println(user.getUsername());
        
        return null;
    }
}
