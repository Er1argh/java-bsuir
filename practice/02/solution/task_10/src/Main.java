/*
 * Необходимо написать перегруженные конструкторы в классе Student.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student ivanov = new Student(1, "Ivan");
        Student petrov = new Student();

        processStudent(scanner, ivanov);
        processStudent(scanner, petrov);

        scanner.close();
    }

    static int getPositiveInt(Scanner scanner, String message, int limit) {
        int value;

        System.out.print(message);

        while (true) {
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();

                if (0 <= value && value <= limit) {
                    return value;
                } else {
                    System.out.println("Ошибка! Введите положительное число ([0, " + limit + "]).");
                }
            } else {
                System.out.println("Ошибка! Введите целое число.");
                scanner.next();
            }
        }
    }

    static void processStudent(Scanner scanner, Student student) {
        student.show();

        int gradesNumber = getPositiveInt(scanner, "Введите количество оценок: ", 30);
        int[] grades = new int[gradesNumber];

        for (int i = 0; i < gradesNumber; i++) {
            grades[i] = getPositiveInt(scanner, "Введите оценку: ", 10);
        }

        System.out.println("Средняя оценка: " + student.calculateAverageGrade(grades));
    }
}
