import java.io.*;
import java.net.*;

public class Server {
    

    public static void  main(String[] args)   throws IOException
    /*Throw exception because the port might not be available */
    {
      ServerSocket sersocket = new  ServerSocket(9999);

      System.out.println("Waiting for client");
      
    
      /*Waits for clients then creates a seperate socket once the client arrive*/
      Socket sock = sersocket.accept();/*We can use this to start interacting with the client */

      System.out.println(" connected to client");
      /*Two streams can be created here for communication with the client */
      
      InputStream in = sock.getInputStream();
      /*input from client */
      OutputStream out = sock.getOutputStream();
      /*output from client */

      /*create a buffer */
      byte buffer[]  =  new byte[1024];
      in.read(buffer);

      System.out.println("Received from client :: " + new String(buffer).trim());

      out.write("Hello from Server .....".getBytes());

      sock.close();
      sersocket.close();



    } 
}
