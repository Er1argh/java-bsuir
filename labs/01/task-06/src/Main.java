/* Выведите на экран первые 11 членов последовательности Фибоначчи.
 * Первый и второй члены последовательности равны единицам, а каждый
 * следующий – сумме двух предыдущих. */

public class Main {
    public static void main(String[] args) {
        int n = 11;
        int first = 1;
        int second = 1;

        System.out.print(first + " " + second + " ");

        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(next + " ");

            first = second;
            second = next;
        }
    }
}
