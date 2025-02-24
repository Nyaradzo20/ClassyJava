package inputoutput;

import java.io.FileWriter;
import java.io.IOException;

public class File {
    @SuppressWarnings("CallToPrintStackTrace")
    public static void  main(String[] args){
        try(FileWriter writer = new FileWriter("Output.txt")){
            writer.write("My file \n");
            writer.write("My file2");
            writer.append("My files");
        }
        catch (IOException e){
           e.printStackTrace();
        }
    }
    
}
