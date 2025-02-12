/* Дана матрица A[N, M]. Найдите в каждой строке матрицы максимальный
 * и минимальный элементы и поменяйте их местами с первым и последним
 * элементом строки соответственно. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк (N): ");
        int n = scanner.nextInt();
        System.out.print("Введите количество столбцов (M): ");
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Исходная матрица:");
        printMatrix(matrix);


        for (int i = 0; i < n; i++) {
            int maxIndex = 0;
            int minIndex = 0;
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] > matrix[i][maxIndex]) {
                    maxIndex = j;
                }
                if (matrix[i][j] < matrix[i][minIndex]) {
                    minIndex = j;
                }
            }

            int temp = matrix[i][0];
            matrix[i][0] = matrix[i][maxIndex];
            matrix[i][maxIndex] = temp;

            temp = matrix[i][m - 1];
            matrix[i][m - 1] = matrix[i][minIndex];
            matrix[i][minIndex] = temp;
        }

        System.out.println("Преобразованная матрица:");
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
