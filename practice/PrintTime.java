import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Clock {
    private String currentTime;
    private  final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public void updateTime() {
        
        currentTime = LocalDateTime.now().format(formatter);
    }
}
    public class PrintTime implements Runnable {
        private final datenTime;
        @ Override
        public void run(){
            while (true) {
                datenTime =updateTime();
    }

    public class UpdateTime implements  Runnable{
        while (true) {
            ();
            try {
                Thread.sleep(1000); // Update every 1 second
            } catch (InterruptedException e) {
                System.err.println("Update thread interrupted: " + e.getMessage());
            }
        }
    }


    }
     
    public void DisplayTime(){

    }



    public static void main(String[] args) {
        DisplayTime();
    }
}
