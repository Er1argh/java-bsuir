/* Напишите программу, которая выводит на экран первые четыре степени
 * числа n. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = 0;

        while (true) {
            System.out.println("Введите число n: ");
            if (scanner.hasNextDouble()) {
                n = scanner.nextDouble();
                break;
            } else {
                System.out.println("Ошибка! Введенное значение не является числом!");
                scanner.next();
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(n + " в степени " + i + " равно " + Math.pow(n, i));
        }

        scanner.close();
    }
}
