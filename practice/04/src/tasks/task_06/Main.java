/**
 * Необходимо создать класс NewThread расширяющий Thread.
 * Переопределить метод run(). В цикле for вывести на консоль символ 100 раз.
 * Создать экземпляр класса и запустить новый поток.
 * Создать класс, реализующий интерфейс Runnable.
 * Переопределить run() метод.
 * Создать цикл for.
 * В цикле распечатать значения от 0 до 100 делящиеся на 10 без остатка.
 * Необходимо используем статический метод Thread.sleep(), чтобы сделать паузу.
 * Создать три потока, выполняющих задачу распечатки значений.
 */

package tasks.task_06;

public class Main {
    public static void main(String[] args) {
        NewThread dogThread = new NewThread('@');
        dogThread.start();

        MyRunnable numberTask = new MyRunnable();

        Thread thread1 = new Thread(numberTask, "Поток 1");
        Thread thread2 = new Thread(numberTask, "Поток 2");
        Thread thread3 = new Thread(numberTask, "Поток 3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
