/*Use a Scanner to capture the input string and characters to be removed.
Iterate through the original string using a for loop or enhanced loop.
Use a condition to check if the current character exists in the "to remove" string.
Append all characters not to be removed into a new string using a StringBuilder.
Hint:
Use the .contains() method of String to check if a character exists in the removal string*/

import java.util.Scanner;
public class remoVe {
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        StringBuilder sb =  new  StringBuilder();
        System.out.println("Enter string");
        String str = input.nextLine();
        System.out.println("enter char");
        char c = input.next().charAt(0);
        for(int i = 0; i < str.length(); i++)
        {
           if (str.charAt(i) != c){
               
               sb.append(str.charAt(i));
           }
        }

       
        System.out.println(sb.toString());
      
         input.close(); 
    }
}
