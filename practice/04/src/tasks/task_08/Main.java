/**
 * Необходимо изменить класс MyQueue из примера выше.
 * Вместо int n добавить Queue<T> (MyQueue сделать обобщенным), который будет содержать объекты, создаваемые Producer.
 * Добавить еще один объект Consumer, который будет запускаться тоже отдельным потоком.
 * Вывести на консоль какой из объектов Consumer обработал объект из очереди.
 * Изменить цикл for на бесконечный.
 */

package tasks.task_08;

public class Main {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue();

        Integer[] values = {1, 2, 3, 4, 5};
        Producer<Integer> producer = new Producer<>(myQueue, values);

        Consumer<Integer> consumer1 = new Consumer<>(myQueue, 1);
        Consumer<Integer> consumer2 = new Consumer<>(myQueue, 2);

        new Thread(producer).start();
        new Thread(consumer1).start();
        new Thread(consumer2).start();
    }
}
