/* Дана матрица A[N, M]. Найдите в каждой строке матрицы максимальный
 * и минимальный элементы и поменяйте их местами с первым и последним
 * элементом строки соответственно. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = getPositiveInt(scanner, "Введите количество строк (N): ");
        int m = getPositiveInt(scanner, "Введите количество столбцов (M): ");

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = (int) (Math.random() * 11);
            }
        }

        System.out.println("Исходная матрица:");
        printMatrix(matrix);

        for (int i = 0; i < n; i++) {
            int minIndex = 0;
            int maxIndex = 0;

            for (int j = 1; j < m; j++) {
                if (matrix[i][j] < matrix[i][minIndex]) minIndex = j;
            }

            if (minIndex != m - 1) swap(matrix[i], m - 1, minIndex); // if not last

            for (int j = 1; j < m; j++) {
                if (matrix[i][j] > matrix[i][maxIndex]) maxIndex = j;
            }

            if (maxIndex != 0) swap(matrix[i], 0, maxIndex); // if not first
        }

        System.out.println("Преобразованная матрица:");
        printMatrix(matrix);
        scanner.close();
    }

    private static int getPositiveInt(Scanner scanner, String message) {
        int value;
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value > 0) return value;
            } else {
                scanner.next();
            }
            System.out.println("Ошибка! Введите положительное целое число.");
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%3d ", num);
            }
            System.out.println();
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
