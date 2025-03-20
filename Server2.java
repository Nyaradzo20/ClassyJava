import java.net.ServerSocket;
import  java.io.*;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;


class QuoteService{

    Map<String, String> productinfo = new HashMap<String, String>();
     
    public QuoteService(){
           productinfo.put("a","100");
           productinfo.put("b","200");

    }

    public String getQuote(String product)
    {
      return productinfo.get(product);
    }




}

public class Server2 {
    public static void main(String[] args)  throws IOException{
        
    QuoteService quoteService = new QuoteService();
    ServerSocket sersocket = new ServerSocket(9999);
    
    System.out.println("Listening to 9999");

    while (true) {

        Socket  sock = sersocket.accept();

        InputStream in =  sock.getInputStream();

        OutputStream out = sock.getOutputStream();
        
        System.out.println("reading from client");

        byte request[] = new byte[100];

        in.read(request);
        String product = new String(request).trim();

        System.out.println("Received product name");

        String price = quoteService.getQuote(product);

         
         if (price == null) {
            price = "invalid product";
            
         }




out.write(price.getBytes());

System.out.println("response sent");
 sock.close();
    }
}

}
