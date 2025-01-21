/*Write a program that does the following:
Takes an input grade (as a single uppercase character like A, B, C, D, or F).
Prints a corresponding message based on the grade:
A: Excellent
B: Good
C: Average
D: Below Average
F: Fail
If the input is not valid (e.g., Z), display "Invalid Grade."*/
import java.util.Scanner;

public class control{
public static void main(String[] args){
    Scanner lnput = new Scanner(System.in);

    //Prompting thee user to enter the grade symbol
    System.out.println("Enter grade");
    
    //getting input  from user using next().charAt(index) because nextChar() does not exist
    char gradein = lnput.next().charAt(0);
    
    //Switch statement begins, uses grade as an expression
    switch(gradein){
        
        case 'A':
              System.out.println(" Excellent");
              break;
            
        case 'B':
              System.out.println(" Good");
              break;
        case 'C':
              System.out.println(" Average");
              break;
        case 'D':
              System.out.println(" Below average");
              break;
        case 'F':
              System.out.println(" Fail");
              break;
      default:
            System.out.println(" invalid");
           }
    lnput.close();
}
}
