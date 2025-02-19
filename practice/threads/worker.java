package threads;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class worker implements  Runnable{
    @Override
    public void run()
    {
       
        int min = 1000;
        int max = 3000;
        int count= 0;
        while ( count < 5) { 
            int sleepfor  = ThreadLocalRandom.current().nextInt(min, max);
            System.out.println("Random delay for " + " "+ Thread.currentThread().getName()+ " "+ sleepfor + "ms");
            try{
           TimeUnit.MILLISECONDS.sleep(sleepfor);
            }
            catch (InterruptedException e)
            {
            System.out.println("Thread was interrupted");
            }
            count++;
 
 }

    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new worker(), "Nyari");
        Thread t2 = new Thread(new worker(), "Nono");

        t1.start();
        t2.start();
     }
         }

