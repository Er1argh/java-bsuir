/*
 * Необходимо написать методы с переменным числом параметров:
 * - метод выводящий все параметры на консоль;
 * - метод вычисляющий сумму всех параметров;
 * - метод вычисляющий произведение всех параметров;
 * - метод сортирующий параметры по возрастанию.
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printParameters(5, 2, 8, 1, 3);
        System.out.println("Сумма: " + sumParameters(5, 2, 8, 1, 3));
        System.out.println("Произведение: " + multiplyParameters(5, 2, 8, 1, 3));
        System.out.println("Отсортированные параметры: " + Arrays.toString(sortParameters(5, 2, 8, 1, 3)));
    }

    private static void printParameters(int... numbers) {
        System.out.println("Параметры: " + Arrays.toString(numbers));
    }

    private static int sumParameters(int... numbers) {
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        return sum;
    }

    private static int multiplyParameters(int... numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        int product = 1;

        for (int num : numbers) {
            product *= num;
        }

        return product;
    }

    private static int[] sortParameters(int... numbers) {
        Arrays.sort(numbers);

        return numbers;
    }
}
