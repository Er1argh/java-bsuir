import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* 01:
         * В переменной n хранится вещественное число с ненулевой дробной
         * частью. Необходимо создать программу, округляющую число n до ближайшего
         * целого и выводящую результат на экран. */

        double n = 123.456;

        System.out.println(Math.round(n));

        /* 02:
         * В переменных q и w хранятся два натуральных числа. Необходимо
         * создать программу, выводящую на экран результат деления q на w с остатком. */

        int q = 10;
        int w = 3;

        System.out.println("q разделить на w будет " + q / w + " и " + q % w + " в остатке");

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

        /* 07:
         * В переменных a и b лежат положительные длины катетов прямоугольного
         * треугольника. Необходимо вычислить и вывести на экран площадь треугольника
         * и его периметр. */

        int a = 2;
        int b = 2;
        double c = Math.sqrt(a * a + b * b);

        System.out.println("S = " + (a + b) / 2);
        System.out.println("P = " + (a + b + c));

        /* 08:
         * Натуральное положительное число записано в переменную n.
         * Необходимо определить и вывести на экран, сколько цифр в числе n. */

        int naturalPositive = 12345678;

        System.out.println(String.valueOf(naturalPositive).length());

        /* 09:
         * Необходимо создать программу, которая будет генерировать и выводить
         * на экран вещественное псевдослучайное число из промежутка [-3;3). */

        System.out.println(Math.random() * 6 - 3);

        /* 10:
         * В переменные a и b записаны целые числа, при этом b больше a.
         * Необходимо создать программу, которая будет генерировать и выводить на экран
         * целое псевдослучайное число из отрезка [a;b]. */

        int aLeft = 10;
        int bRight = 15;

        System.out.println(aLeft + (int) (Math.random() * (bRight - aLeft + 1)));

        /* 11:
         * Необходимо создать массив из всех нечетных чисел от 1 до 99, вывести
         * его на экран в строку, а затем этот же массив вывести на экран тоже в строку,
         * но в обратном порядке (99 97 95 93 … 7 5 3 1). */

        int[] oddNumbers = new int[50];

        for (int i = 0, oddNumber = 1; i < oddNumbers.length; i++, oddNumber += 2) {
            oddNumbers[i] = oddNumber;
        }

        for (int oddNumber : oddNumbers) {
            System.out.print(oddNumber + " ");
        }

        System.out.println();

        for (int i = oddNumbers.length - 1; i >= 0; i--) {
            System.out.print(oddNumbers[i] + " ");
        }

        // Новая строка для следующего задания
        System.out.println();

        /* 12:
         * Необходимо создать массив из 15 случайных целых чисел из отрезка
         * [0;9]. Вывести массив на экран. Подсчитать сколько в массиве четных элементов
         * и вывести это количество на экран в отдельной строке. */

        int[] array = new int[15];
        int evenCount = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 9);

            if (array[i] % 2 == 0) {
                evenCount++;
            }
        }

        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.println(evenCount);

        /* 13:
         * Необходимо создать двумерный массив из 7 строк по 4 столбца в каждой,
         * заполненными случайными целыми числами из отрезка [–5;5]. Вывести массив
         * на экран. Определить и вывести на экран индекс строки с наибольшим по модулю
         * произведением элементов. Если таких строк несколько, то вывести индекс
         * первой встретившейся из них. */

        int rows = 7;
        int cols = 4;
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 11) - 5;
            }
        }

        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%3d", num);
            }

            System.out.println();
        }

        int maxProductRowIndex = 0;
        long maxProduct = 1;

        for (int i = 0; i < rows; i++) {
            int product = 1;

            for (int j = 0; j < cols; j++) {
                product *= matrix[i][j];
            }

            if (i == 0 || Math.abs(product) > Math.abs(maxProduct)) {
                maxProduct = product;
                maxProductRowIndex = i;
            }
        }

        System.out.println(maxProductRowIndex);
    }
}