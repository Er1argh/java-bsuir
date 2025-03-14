public class WrongLoginException extends Exception {
    public WrongLoginException() {
        super("Неверный логин!");
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
