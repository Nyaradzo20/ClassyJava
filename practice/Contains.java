import java.util.Scanner;
public class Contains {
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter string");
        String str = input.nextLine();
        if (str.contains("sandy")) {
             System.out.println("Yes");
          }
         else
         {
               System.out.println("no");
         }

    

        
        
      
         input.close(); 
    }
}
