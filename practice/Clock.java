
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Clock {
    // Inner class to represent the clock date and time
    static class ClockDate {
        private String time;
        private final DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");

        // Synchronized method to update time safely
        public synchronized void updateTime() {
            time = LocalDateTime.now().format(timeFormat);
        }

        // Synchronized method to get time safely
        public synchronized String getTime() {
            return time;
        }

        // Constructor to initialize time on creation
        public ClockDate() {
            time = LocalDateTime.now().format(timeFormat);
        }
    }

    // Instance of ClockDate to hold the current time
    private final ClockDate clockDate = new ClockDate();

    // Runnable task to update the clock time
    static class UpdateTask implements Runnable {
        private final Clock clock;

        public UpdateTask(Clock clock) {
            this.clock = clock;
        }

        @Override
        public void run() {
            while (true) { // Keep updating time
                clock.clockDate.updateTime();
                try {
                    Thread.sleep(1000); // Update every second
                } catch (InterruptedException e) {
                    System.err.println("Update thread interrupted: " + e.getMessage());
                    return; // Exit thread if interrupted
                }
            }
        }
    }

    // Runnable task to display the clock time
    static class DisplayTask implements Runnable {
        private final Clock clock;

        public DisplayTask(Clock clock) {
            this.clock = clock;
        }

        @Override
        public void run() {
            while (true) { // Keep displaying time
                // Use \r to overwrite the same line
                System.out.print("\rCurrent Time: " + clock.clockDate.getTime());
                System.out.flush(); // Force the console to refresh
                try {
                    Thread.sleep(1000); // Refresh display every second
                } catch (InterruptedException e) {
                    System.err.println("Display thread interrupted: " + e.getMessage());
                    return; // Exit thread if interrupted
                }
            }
        }
    }

    public static void main(String[] args) {
        Clock clock = new Clock();

        // Create tasks
        Runnable updateTask = new UpdateTask(clock);
        Runnable displayTask = new DisplayTask(clock);

        // Create threads
        Thread backgroundUpdaterThread = new Thread(updateTask, "Background-Updater");
        Thread displayThread = new Thread(displayTask, "Display-Thread");

        // Set priorities
        backgroundUpdaterThread.setPriority(Thread.MIN_PRIORITY); // Low priority
        displayThread.setPriority(Thread.MAX_PRIORITY); // High priority

        // Start threads
        backgroundUpdaterThread.start();
        displayThread.start();

        System.out.println("\nClock application started. Press Ctrl+C to exit.");
    }
}
