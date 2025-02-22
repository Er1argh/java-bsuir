public class Main {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(2, 2);
        Matrix m2 = new Matrix(2, 2);
        m1.fillRandom(1, 10);
        m2.fillRandom(1, 10);

        System.out.println("Матрица 1:");
        m1.print();
        System.out.println("Матрица 2:");
        m2.print();

        Matrix sum = m1.add(m2);
        System.out.println("Сумма:");
        sum.print();

        Matrix diff = m1.subtract(m2);
        System.out.println("Разность:");
        diff.print();

        Matrix product = m1.multiply(m2);
        System.out.println("Произведение:");
        product.print();
    }
}
