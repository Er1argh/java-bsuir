/* Напишите программу, выводящую на экран все четырехзначные числа
 * последовательности 1000 1003 1006 1009 1012 1015 …. */

public class Main {
    public static void main(String[] args) {
        for (int num = 1000; num <= 10000; num += 3) {
            System.out.print(num + " ");
        }
    }
}
