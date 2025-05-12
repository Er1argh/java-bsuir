/**
 * На базе коллекций реализуйте структуру хранения чисел с поддержкой
 * следующих операций: добавление/удаление числа; поиск числа, наиболее
 * близкого к заданному (т.е. модуль разницы минимален).
 */

package tasks.task_02;

public class Main {
    public static void main(String[] args) {
        NumberStorage storage = new NumberStorage();
        storage.add(10);
        storage.add(5);
        storage.add(20);

        storage.add(100);
        storage.remove(100);

        System.out.println(storage.findClosest(12));
        System.out.println(storage.findClosest(16));
    }
}
