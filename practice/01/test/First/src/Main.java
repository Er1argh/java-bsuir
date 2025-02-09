import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("My first program");
//
//        int b = 5;
//        int c = 15;
//        int a = 4 * (b + c - 1) / 2;
//
//        System.out.println("b = " + b + ";\nc = " + c + ";\na = 4 * (b + c - 1) / 2 = " + a);
//
//        byte b;
//        int i = 257;
//        double d = 323.142;
//
//        System.out.println(b = (byte) i);
//        System.out.println(i = (int) d);
//        System.out.println(b = (byte) d);
//
//        double n = 10.5;
//
//        System.out.println(Math.round(n));
//
//        int q = 10;
//        int w = 3;
//
//        System.out.println(q / w + " и " + q % w + " в остатке");
//
//        int number = 1;
//
//        while (number <= 10) {
//            if (number % 2 == 0) {
//                System.out.println(number + " - четное");
//            } else {
//                System.out.println(number + " - нечетное");
//            }
//            number++;
//        }
//
//        int number = 2;
//        int count = 0;
//
//        do {
//            System.out.println(number + " ");
//            number *= 2;
//            count++;
//        } while (count < 10);
//
//        int sum = 0;
//
//        for (int i = -20; i <= 20; i++) {
//            if (i % 2 == 0) {
//                sum += i;
//            }
//        }
//
//        System.out.println(sum);
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите номер месяца (1-12): ");
//
//        if (scanner.hasNextInt()) {
//            int month = scanner.nextInt();
//
//            switch (month) {
//                case 12, 1, 2:
//                    System.out.println("Зима");
//                    break;
//                case 3, 4, 5:
//                    System.out.println("Весна");
//                    break;
//                case 6, 7, 8:
//                    System.out.println("Лето");
//                    break;
//                case 9, 10, 11:
//                    System.out.println("Осень");
//                    break;
//                default:
//                    System.out.println("Ошибка: введите число от 1 до 12.");
//            }
//        } else {
//            System.out.println("Ошибка: введите целое число.");
//        }
//
//        scanner.close();
//
//        int a = 5;
//        int b = 10;
//        double c = Math.sqrt(a * a + b * b);
//        double p = a + b + c;
//        double s = 0.5 * a * b;
//
//        System.out.println("P: " + p);
//        System.out.println("S: " + s);
//
//        int n = 12345;
//
//        System.out.println(String.valueOf(n).length());
//
//        System.out.println(-3 + Math.random() * 6);

        int a = 10;
        int b = 15;

        System.out.println(a + (int) (Math.random() * (b - a + 1)));
    }
}