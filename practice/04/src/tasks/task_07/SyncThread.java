package tasks.task_07;

public class SyncThread extends Thread {
    private final StringBuilder target;

    public SyncThread(StringBuilder target) {
        this.target = target;
    }

    @Override
    public void run() {
        synchronized (target) {
            if (target.isEmpty()) {
                System.err.println("Ошибка: StringBuilder пуст!");

                return;
            }

            for (int i = 0; i < 100; i++) {
                System.out.println(target.charAt(0));
            }

            target.setCharAt(0, (char) (target.charAt(0) + 1));
        }
    }
}
