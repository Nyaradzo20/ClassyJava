import java.util.Scanner;

public class Atm
{
    public static double balance = 0;
    
     public static void deposit(double amount){
         balance += amount;
             System.out.printf("You have deposited %.2f\n", amount);
             System.out.printf("Your new balance is %.2f\n", balance);
    }
    
        public static void withdraw(double withdrawal) {
            if (withdrawal <= balance)
            {
                balance -= withdrawal;
             System.out.printf("You have withdrawn %.2f\n", withdrawal);
             System.out.printf("Your new balance is %.2f\n", balance);
            }
            else{
                     System.out.print("insufficient amount ");

            }
        }

    
         
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean exit = false;
        
        
         while (!exit) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = in.nextInt();
        

            switch (choice) {
                case 1: 
                    System.out.print("Enter Deposit Amount: ");
                    double depositAmount = in.nextDouble();
                    deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter Withdrawal Amount: ");
                    double withdrawalAmount = in.nextDouble();
                    withdraw(withdrawalAmount);
                    break;
                case 3: 
                    System.out.printf("Your current balance is %.2f\n", balance);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }                     
    
}
}
}
