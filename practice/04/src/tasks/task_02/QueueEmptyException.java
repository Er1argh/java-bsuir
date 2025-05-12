package tasks.task_02;

public class QueueEmptyException extends Exception {
    public QueueEmptyException(String message) {
        super(message);
    }
}
