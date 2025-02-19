package threads;

public class MyThread  extends Thread{
    @Override   
    public void run(){
        int count = 0;  
       while ( count < 5) { 
           System.out.println("Hello from thread");
           //try{
          // Thread.sleep(5000);
           //}
           //catch (InterruptedException e)
           //{
           // System.out.println("Thread was interrupted");
           //}
           count++;

}
    }

public static void main(String[] args) {
   MyThread  t1 = new MyThread();
   t1.start();
}
    }