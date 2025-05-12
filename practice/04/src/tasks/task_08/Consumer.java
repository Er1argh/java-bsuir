package tasks.task_08;

public class Consumer<T> implements Runnable {
    private final MyQueue<T> myQueue;
    private final int id;

    public Consumer(MyQueue<T> myQueue, int id) {
        this.myQueue = myQueue;
        this.id = id;
    }

    public void run() {
        while (true) {
            T value = myQueue.get();
            System.out.println("Consumer " + id + " обработал: " + value);

            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
