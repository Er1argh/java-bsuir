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
        int n;

        while (true) {
            System.out.print("Введите натуральное число большее 3: ");

            if (scanner.hasNextInt()) {
                n = scanner.nextInt();

                if (n > 3) {
                    break;
                } else {
                    System.out.println("Число должно быть больше 3. Попробуйте снова.");
                }
            } else {
                System.out.println("Ошибка! Введеное значение не является натуральным числом.");
                scanner.next();
            }
        }


        int[] array = new int[n];

        System.out.println("Первый массив:");

        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * (n + 1));
            System.out.print(array[i] + " ");
        }

        System.out.println();

        int evenCount = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }


        int[] evenArray = new int[evenCount];
        int index = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                evenArray[index] = num;
                index++;
            }
        }

        if (evenCount > 0) {
            System.out.println("Второй массив (четные элементы):");
            for (int num : evenArray) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("Во втором массиве нет четных элементов.");
        }
    }
}
