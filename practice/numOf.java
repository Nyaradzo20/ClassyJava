import java.util.Scanner;
public class numOf {
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter string");
        String str = input.nextLine();
        System.out.println("enter char");
        char c = input.next().charAt(0);
        for(int i = 0; i <= str.length()-1; i++)
        {
            if(str.charAt(i) == c)
            {
                 count++;
            }
           
        }

        System.out.println("The character '" + c + "' appears in \"" + str + "\" " + count + " times.");
        
      
         input.close(); 
    }
}
