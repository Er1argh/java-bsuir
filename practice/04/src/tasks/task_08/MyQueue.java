package tasks.task_08;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue<T> {
    private final Queue<T> queue = new LinkedList<>();
    private static final int MAX_SIZE = 10;

    public synchronized T get() {
        while (queue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        T value = queue.poll();
        notifyAll();
        return value;
    }

    public synchronized void put(T value) {
        while (queue.size() >= MAX_SIZE) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        queue.add(value);
        System.out.println("Отправлено: " + value);
        notifyAll();
    }
}
