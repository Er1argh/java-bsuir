public class Main {
    public static void main(String[] args) {
        // 01
        int[] oddNumbers = new int[50];

        for (int i = 0, oddNumber = 1; i < 50; i++, oddNumber += 2) {
            oddNumbers[i] = oddNumber;
        }

        for (int oddNumber : oddNumbers) {
            System.out.print(oddNumber + " ");
        }

        System.out.println();

        for (int i = oddNumbers.length - 1; i >= 0; i--) {
            System.out.print(oddNumbers[i] + " ");
        }

        System.out.println();

        // 02
        int[] array = new int[15];
        int evenCount = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);

            if (array[i] % 2 == 0) {
                evenCount++;
            }
        }

        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println("\n" + evenCount);

        // 03
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
