import java.util.Scanner;
public class indeXof {
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter string");
        String str = input.nextLine();
        /*The .indexOf() method in Java is used to find the first occurrence of a character or substring in a string. 
        It returns the index position where the character or substring is found. If it is not found, it returns -1.*/
        if (str.indexOf("sandy") != -1) {
             System.out.println("Yes");
          }
         else
         {
               System.out.println("no");
         }

    

        
        
      
         input.close(); 
    }
}
