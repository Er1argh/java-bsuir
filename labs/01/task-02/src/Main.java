/* Напишите программу, которая запрашивает пароль (например,
 * четырехзначное число) до тех пор, пока он не будет правильно введен. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int CORRECT_PASSWORD = 1234;
        int enteredPassword;

        while (true) {
            System.out.print("Введите пароль (четырёхзначное число): ");

            if (scanner.hasNextInt()) {
                enteredPassword = scanner.nextInt();

                if (enteredPassword == CORRECT_PASSWORD) {
                    System.out.println("Пароль верный. Доступ разрешён!");
                    break;
                } else {
                    System.out.println("Неверный пароль. Попробуйте ещё раз.");
                }
            } else {
                System.out.println("Ошибка! Введите четырёхзначное число.");
                scanner.next();
            }
        }

        scanner.close();
    }
}
