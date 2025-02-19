package threads;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class worker implements  Runnable{
    @Override
    public void run()
    {
       
        int min = 1000;
        int max = 5000;
        int count= 0;
        while ( count < 5) { 
            int sleepfor  = ThreadLocalRandom.current().nextInt(min, max);
            System.out.println("Random delay for " + " "+ sleepfor + "ms");
            try{
           TimeUnit.MILLISECONDS.sleep(ThreadLocalRandom.current().nextInt(min, max));
            }
            catch (InterruptedException e)
            {
            System.out.println("Thread was interrupted");
            }
            count++;
 
 }

    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new worker());
        t1.start();
     }
         }

