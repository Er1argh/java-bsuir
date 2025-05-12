/**
 * Создайте класс, реализующий интерфейс Runnable. Переопределите
 * метод run(). Создайте цикл for. В цикле распечатайте значения от 0 до 100
 * делящиеся на 10 без остатка. Необходимо использовать статический метод
 * Thread.sleep(), чтобы сделать паузу. Создайте три потока, выполняющих задачу
 * распечатки значений.
 */

package tasks.task_05.test;

import tasks.task_05.service.TenMultiplesPrinter;

public class Main {
    public static void main(String[] args) {
        Runnable printTask = new TenMultiplesPrinter();

        for (int i = 1; i <= 3; i++) {
            new Thread(printTask, "Stream number " + i).start();
        }
    }
}
