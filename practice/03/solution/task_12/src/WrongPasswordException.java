public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super("Неверный пароль!");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
