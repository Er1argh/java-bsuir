/*
 * Необходимо написать лямбда выражение, которое принимает на вход число
 * и возвращает значение "Положительное число", "Отрицательное число" или
 * "Ноль". Используем функциональный интерфейс Function.
 */

package tasks.task_03;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer, String> numberClassifier = x ->
                x > 0 ? "Положительное число" : (x < 0 ? "Отрицательное число" : "Ноль");

        System.out.println(numberClassifier.apply(10));
        System.out.println(numberClassifier.apply(-5));
        System.out.println(numberClassifier.apply(0));
    }
}
