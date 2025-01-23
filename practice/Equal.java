import java.util.Scanner;
public class Equal {
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter string");
        String str = input.nextLine();
              
        System.out.println("Enter string");
        String string = input.nextLine();
        
         System.out.println(str.equals(string));
         input.close(); 
    }
}
