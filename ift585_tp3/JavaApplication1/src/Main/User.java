/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

public class User {
    
    String username;
    String password;
    boolean isOnline;
    
    public User(){  
    }
    
    public User(String u, String p){
        this.username = u;
        this.password = p;
    }
    
    public String getUsername(){
       return this.username;
    }
    
    public void setUsername(String username){
       this.username = username;
    }
    
    public void setPassword(String pwd){
       this.password = pwd;
    }
   
    public void setIsOnline(boolean online){
       this.isOnline = online;
    }
   
    public boolean getIsOnline(){
       return this.isOnline;
    }
    
}
