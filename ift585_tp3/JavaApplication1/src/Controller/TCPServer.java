package Controller;

import java.io.IOException;
import java.net.ServerSocket;

/**
 *
 * @author grom2209
 */
public final class TCPServer {
    
    final int SERVER_PORT = 12345;      //STUB
    ServerSocket serverSocket;
    //List of all members
    //List of all groups
    
    public TCPServer(){
       
    }
    
    public void startTCPServer() throws IOException{
        this.serverSocket = new ServerSocket(SERVER_PORT);   
    }
    
    public int getServerPort(){
        return this.SERVER_PORT;
    }
    
}
