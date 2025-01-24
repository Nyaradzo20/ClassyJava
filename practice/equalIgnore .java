/*Check if the strings are the same regardless of case using the .equalsIgnoreCase() method.*/
import java.util.Scanner;
public class equalIgnore  {
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter string");
        String str = input.nextLine();
              
        System.out.println("Enter string");
        String string = input.nextLine();
        //Check if the strings are the same regardless of case 
         System.out.println(str.equalsIgnoreCase(string));
         input.close(); 
    }
}
