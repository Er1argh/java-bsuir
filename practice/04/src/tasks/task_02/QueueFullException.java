package tasks.task_02;

public class QueueFullException extends Exception {
    public QueueFullException(String message) {
        super(message);
    }
}
