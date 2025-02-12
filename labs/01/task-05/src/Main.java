/* Напишите программу, выводящую на экран все четырехзначные числа
 * последовательности 1000 1003 1006 1009 1012 1015 …. */

public class Main {
    public static void main(String[] args) {
        for (int number = 1000; number <= 10000; number += 3) {
            System.out.print(number + " ");
        }
    }
}
