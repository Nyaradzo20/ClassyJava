/*

Challenge: Simple Tip Calculator
Write a program that:

Asks the user for the bill amount (as a decimal).
Asks the user for the tip percentage they want to leave (as a whole number).
Calculates the tip amount and the total bill (bill amount + tip).
Prints the calculated tip amount and the total bill to the console.
*/
import java.util.Scanner;

public class MyClass {
  public static void main(String args[]) {
   
 double bill;
 int tip;
 double total;
  Scanner in = new Scanner(System.in);
  
  System.out.println("What is the bill in decimal form?");
  bill = in.nextDouble();
 System.out.printf("The bill is $%.2f\n", bill);
 System.out.println("What is the  the tip percentage you want to leave?");
 tip = in.nextInt();
 
  System.out.printf("The bill is %d%%\n", tip);
  total = (bill / 100 * 4 + bill);
  System.out.printf("The total is $%.2f", total);

  

  }
}
