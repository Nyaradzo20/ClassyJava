package threads;

public class BankAccount implements Runnable {
    private double balance = 1000;

    public synchronized void withdraw(double amount) {
        System.out.println(Thread.currentThread().getName() + " is trying to withdraw: $" + amount);
        if (amount > balance) {
            System.out.println("Not enough funds for " + Thread.currentThread().getName() +". "  + "You have " + " " + "$" +  balance );
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful for " + Thread.currentThread().getName() + ". New balance: $" + balance);
        }
    }

    @Override
    public void run() {
        withdraw(700.00);
    }

    public static void main(String[] args) {
        BankAccount sharedAccount = new BankAccount();
        Thread Alice = new Thread(sharedAccount, "Alice");
        Thread Bob = new Thread(sharedAccount, "Bob");

        Alice.start();
        Bob.start();
    }
}
