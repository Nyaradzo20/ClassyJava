package threads;

public class Main extends Thread {
   @Override
  public void run () {
    System.out.println("This code is running in a thread");
    System.out.println(this.getName());
  }
    public static void main(String[] args) {
      Main thread = new Main();
      thread.start();
      //System.out.println("This code is outside of the thread");
    }
    
  }
