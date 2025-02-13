/* Напишите программу, которая загадывает случайное целое число из
 * отрезка [1;10] и просит пользователя его угадать, вводя варианты с клавиатуры,
 * пока пользователь не угадает число, программа будет ему подсказывать,
 * сообщая больше или меньше число загаданное, чем то, что ввел пользователь. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 10) + 1;
        int guess;

        System.out.println("Загадано число от 1 до 10. Попробуйте угадать!");

        while (true) {
            System.out.print("Введите ваш вариант: ");
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();
                if (guess < 1 || guess > 10) {
                    System.out.println("Число должно быть от 1 до 10. Попробуйте снова!");
                } else if (guess < secretNumber) {
                    System.out.println("Загаданное число больше.");
                } else if (guess > secretNumber) {
                    System.out.println("Загаданное число меньше.");
                } else {
                    System.out.println("Поздравляю! Вы угадали число " + secretNumber + "!");
                    break;
                }
            } else {
                System.out.println("Ошибка! Введите целое число.");
                scanner.next();
            }
        }

        scanner.close();
    }
}
