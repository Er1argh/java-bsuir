/* Пользователь вводит с клавиатуры натуральное число большее 3,
 * которое сохраняется в переменную n. Если пользователь ввел не подходящее
 * число, то программа должна просить пользователя повторить ввод. Создайте
 * массив из n случайных целых чисел из отрезка [0;n] и выведите его на экран.
 * Создайте второй массив только из четных элементов первого массива, если они
 * там есть, и выведите его на экран. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = getNaturalNumber(scanner, "Введите натуральное число большее 3: ", 3);

        int[] array = generateArray(n);
        System.out.println("Первый массив:");
        printArray(array);

        int[] evenArray = extractEvenNumbers(array);
        System.out.println(evenArray.length > 0 ? "Второй массив (четные элементы):" : "Во втором массиве нет четных элементов.");
        printArray(evenArray);

        scanner.close();
    }

    private static int getNaturalNumber(Scanner scanner, String message, int minValue) {
        int num;
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                if (num > minValue) return num;
            } else {
                scanner.next();
            }
            System.out.println("Ошибка! Введите число больше " + minValue + ".");
        }
    }

    private static int[] generateArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * (size + 1));
        }
        return array;
    }

    // Функция извлечения чётных чисел из массива
    private static int[] extractEvenNumbers(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) count++;
        }

        int[] evenArray = new int[count];
        int index = 0;
        for (int num : array) {
            if (num % 2 == 0) evenArray[index++] = num;
        }
        return evenArray;
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
