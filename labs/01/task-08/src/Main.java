/* Напишите программу, которая будет проверять попало ли случайно
 * выбранное из отрезка [5;155] целое число в интервал (25;100) и выводить
 * результат на экран. */

public class Main {
    public static void main(String[] args) {
        int number = 5 + (int) (Math.random() * (155 + 1 - 5));

        if (25 < number && number < 100) {
            System.out.println(number + " попадает в интервал (25;100)");
        } else {
            System.out.println(number + " не попадает в интервал (25;100)");
        }
    }
}
