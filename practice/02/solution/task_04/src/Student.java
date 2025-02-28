import java.util.Scanner;

public class Student {
    public int numberCourse;
    public String nameStudent;

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

    public void show() {
        System.out.println("numberCourse = " + numberCourse + ", nameStudent = " + nameStudent);
    }

    public double calculateAverageGrade(Scanner scanner) {
        int gradesNumber = getPositiveInt(scanner, "Введите количество оценок: ", 30);
        int[] grades = new int[gradesNumber];
        int gradesSum = 0;

        for (int i = 0; i < gradesNumber; i++) {
            int grade = getPositiveInt(scanner, "Введите оценку: ", 10);

            grades[i] = grade;
            gradesSum += grades[i];
        }

        return (double) gradesSum / gradesNumber;
    }
}
