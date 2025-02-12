// Найдите сумму всех n-значных чисел (1 ≤ n ≤ 4)

public class Main {
    public static void main(String[] args) {
        int totalSum = 0;

        for (int n = 1; n <= 4; n++) {
            int first = (int) Math.pow(10, n - 1); // 1
            int last = (int) Math.pow(10, n) - 1; // 9999
            // Формула суммы арифметической прогрессии
            int sum = (first + last) * (last - first + 1) / 2; // n * (a + b) / 2

            totalSum += sum;
        }

        System.out.println("Сумма всех n-значных чисел (1 ≤ n ≤ 4): " + totalSum);
    }
}
