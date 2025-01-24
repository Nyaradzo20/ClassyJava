import java.util.Scanner;
public class subString  {
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter string");
        String str = input.nextLine();
        System.out.println(str.substring(1,5));
        
      
         input.close(); 
    }
}
