/*
 * Необходимо разработать очередь, в которой можно хранить объекты любых
 * типов. Методами get() и set() можно извлечь и добавить объект. Предусмотреть
 * обработку исключений в случае переполнения и пустой очереди.
 */

package tasks.task_02;

public class Main {
    public static void main(String[] args) {
        IQueue<String> queue = new Queue<>(2);

        try {
            queue.set("First");
            queue.set("Second");

            System.out.println(queue.get());
            System.out.println(queue.get());
            System.out.println(queue.get());
        } catch (QueueFullException | QueueEmptyException e) {
            System.out.println(e);
        }
    }
}
