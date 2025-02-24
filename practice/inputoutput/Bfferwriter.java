package inputoutput;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Bfferwriter {
    public static void main(String[] args) {
        
    try(BufferedWriter buff = new BufferedWriter(new FileWriter("Buff.txt"))) {
        buff.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, ");
        buff.flush();
        buff.write("This line is after flush but it might  be writen in the file also");
        
    } catch (Exception e) {
    }
    System.out.print("BufferedWriter");

}
}
