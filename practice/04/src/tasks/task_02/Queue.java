package tasks.task_02;

public class Queue<T> implements IQueue<T> {
    private final T[] elements;
    private int front;
    private int rear;
    private int count;
    private final int capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        elements = (T[]) new Object[capacity];
        front = 0;
        rear = -1;
        count = 0;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public boolean isFull() {
        return count == capacity;
    }

    @Override
    public void set(T item) throws QueueFullException {
        if (isFull()) {
            throw new QueueFullException("Queue is full!");
        }

        rear = (rear + 1) % capacity;
        elements[rear] = item;
        count++;
    }

    @Override
    public T get() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("Queue is empty!");
        }

        T item = elements[front];
        elements[front] = null;
        front = (front + 1) % capacity;
        count--;

        return item;
    }
}
