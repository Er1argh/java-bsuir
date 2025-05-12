/**
 * Напишите программу реализующую ситуацию "Пять глухонемых сидят
 * вокруг круглого стола, перед каждым глухонемым стоит тарелка картошки.
 * Вилки лежат на столе между каждой парой ближайших глухонемых. Каждый
 * глухонемой может либо есть, либо общаться на языке жестов. Глухонемой может
 * есть только тогда, когда держит две вилки – взятую справа и слева. Взятие
 * каждой вилки и возвращение ее на стол являются раздельными действиями,
 * которые должны выполняться одно за другим."
 */

package tasks.task_06;

public class Main {
    private static final int NUM_DEAF = 5;

    public static void main(String[] args) {
        Object[] forks = new Object[NUM_DEAF];

        for (int i = 0; i < NUM_DEAF; i++) {
            forks[i] = new Object();
        }

        for (int i = 0; i < NUM_DEAF; i++) {
            final int deafId = i;
            final Object leftFork = forks[i];
            final Object rightFork = forks[(i + 1) % NUM_DEAF];

            new Thread(() -> {
                try {
                    while (true) {
                        communicate(deafId);
                        eat(deafId, leftFork, rightFork);
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }).start();
        }
    }

    private static void communicate(int deafId) throws InterruptedException {
        System.out.printf("Deaf number %d is communicating\n", deafId);
        Thread.sleep((long) (Math.random() * 1000));
    }

    private static void eat(int deafId, Object leftFork, Object rightFork) throws InterruptedException {
        if (deafId == NUM_DEAF - 1) {
            synchronized (rightFork) {
                synchronized (leftFork) {
                    performEating(deafId);
                }
            }
        } else {
            synchronized (leftFork) {
                synchronized (rightFork) {
                    performEating(deafId);
                }
            }
        }
    }

    private static void performEating(int deafId) throws InterruptedException {
        System.out.printf("Deaf number %d is eating\n", deafId);
        Thread.sleep((long) (Math.random() * 1000));
        System.out.printf("Deaf number %d finished eating\n", deafId);
    }
}
