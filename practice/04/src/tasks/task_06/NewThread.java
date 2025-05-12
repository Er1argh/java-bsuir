package tasks.task_06;

public class NewThread extends Thread {
    private final char symbol;

    public NewThread(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(symbol);
        }
    }
}
