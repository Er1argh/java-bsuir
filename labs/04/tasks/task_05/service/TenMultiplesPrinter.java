package tasks.task_05.service;

public class TenMultiplesPrinter implements Runnable {
    public void run() {
        for (int i = 0; i <= 100; i += 10) {
            System.out.println(Thread.currentThread().getName() + " -> " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("The stream was interrupted: " + e.getMessage());
            }
        }
    }
}
