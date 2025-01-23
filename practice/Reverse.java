import java.util.Scanner;
public class Reverse {
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string");
        String str = input.nextLine();
               for (int i = str.length()-1;i >= 0; i--)  {
                   System.out.print(str.charAt(i));
                            
               }
          
         input.close(); 
    }
}
