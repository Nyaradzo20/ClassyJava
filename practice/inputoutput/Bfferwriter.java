package inputoutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Bfferwriter {
    public static void main(String[] args) {
        
    try(BufferedWriter buff = new BufferedWriter(new FileWriter("Buff.txt"))) {
        buff.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, ");
        buff.flush();
        buff.write("This line is after flush but it might  be writen in the file also");
        
        System.out.print("BufferedWriter");
    } catch (Exception e) {
        System.err.println("An error occurred while writing to the file: " + e.getMessage());
    }

     // Reading from the same file using BufferedReader
        System.out.println("\nReading the contents of Buff.txt:");
        try (BufferedReader br = new BufferedReader(new FileReader("Buff.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line); // Print each line to the console
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }

}
}
