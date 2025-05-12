package tasks.task_02;

public interface IQueue<T> {
    void set(T item) throws QueueFullException;

    T get() throws QueueEmptyException;

    boolean isEmpty();

    boolean isFull();
}
