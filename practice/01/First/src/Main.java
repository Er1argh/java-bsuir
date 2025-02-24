import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* 03:
         * С помощью цикла while и оператора if необходимо определить четность
         * чисел и вывести их (числа от 1 до 10). 1 – нечетное, 2 – четное и т.д. */

        int number = 1;

        while (number <= 10) {
            System.out.println(number + ((number % 2 == 0) ? " - четное" : " - нечетное"));
            number++;
        }

        /* 04:
         * С помощью цикла do-while необходимо вывести на экран первые 10
         * элементов последовательности 2 4 8 16 32 64 128 …. */

        int sequenceMember = 2;
        int sequenceCounter = 0;

        do {
            System.out.print(sequenceMember + " ");
            sequenceMember *= 2;
            sequenceCounter++;
        } while (sequenceCounter < 10);

        // Новая строка для следующего задания
        System.out.println();

        /* 05:
         * С помощью цикла for необходимо подсчитать сумму всех четных чисел в
         * диапазоне от –20 до 20. */

        int sum = 0;

        for (int i = -20; i <= 20; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);

        /* 06:
         * С помощью оператора switch необходимо написать программу, которая по
         * номеру месяца будет определять пору года. Номер месяца вводится с
         * клавиатуры. Нужно предусмотреть проверку на некорректный ввод. */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер месяца (1-12): ");

        if (scanner.hasNextInt()) {
            int mounth = scanner.nextInt();

            switch (mounth) {
                case 12, 1, 2:
                    System.out.println("Зима");
                    break;
                case 3, 4, 5:
                    System.out.println("Весна");
                    break;
                case 6, 7, 8:
                    System.out.println("Лето");
                    break;
                case 9, 10, 11:
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("Ошибка: введите число от 1 до 12.");
            }
        } else {
            System.out.println("Ошибка: введите целое число.");
        }

        scanner.close();
    }
}
