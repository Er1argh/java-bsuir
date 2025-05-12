package tasks.task_08;

public class Producer<T> implements Runnable {
    private final MyQueue<T> myQueue;
    private final T[] values;

    public Producer(MyQueue<T> myQueue, T[] values) {
        this.myQueue = myQueue;
        this.values = values;
    }

    public void run() {
        int i = 0;

        while (true) {
            myQueue.put(values[i % values.length]);
            i++;

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
