/*
Challenge: Simple ATM Simulator
Create a program that simulates basic ATM functionality. The user can perform the following actions:
Variables:
Use variables to store the user's initial balance.
Input and Output:
Allow the user to input their choices and the amounts for deposits or withdrawals.
Void Methods:
Create methods like checkBalance(), deposit() and withdraw() to handle each operation.
Conditionals and Logic:
Use conditionals to validate withdrawal (e.g., prevent withdrawing more than the balance).
Loops:
Allow the user to keep performing transactions until they choose to exit.

*/

import java.util.Scanner;

public class MyClass {
    
    public static void deposit(double amount){
    System.out.printf("You have deposited %.2f\n", amount);
}
 public static void withdraw(double withdrawal){
     System.out.printf("You have withdrawn %.2f\n", withdrawal);
}
 public static void main(String args[]){
     Scanner in = new Scanner(System.in);
    System.out.print("Enter Deposit Amount: ");
    double amount = in.nextDouble();
    deposit(amount);


    System.out.println("Enter  Amount: ");
    double withdrawal= in.nextDouble();
   withdraw(withdrawal);
    
  }
}

