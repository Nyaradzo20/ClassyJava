package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Bank implements Runnable{
    private double balance = 1000;

    public synchronized void withdraw(String threadName, double amount) {
        System.out.println(threadName + " is trying to withdraw: $" + amount);
        if (amount > balance) {
            System.out.println("Not enough funds for " + threadName + ". You have $" + balance );
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful for " + threadName + ". New balance: $" + balance);
        }
    }

    @Override
    public void run() {
        withdraw(Thread.currentThread().getName(), 700.00);
    }

    public static void main(String[] args) {
        Bank sharedAccount = new Bank();
         ExecutorService executor = Executors.newCachedThreadPool();
         executor.execute(() -> sharedAccount.withdraw("A", 700));
        executor.execute(() -> sharedAccount.withdraw( "B", 700));
        executor.execute(() -> sharedAccount.withdraw("C", 700));
        executor.execute(() -> sharedAccount.withdraw("D",700));
        executor.execute(() -> sharedAccount.withdraw("E", 700));
        executor.shutdown();
    }
}
