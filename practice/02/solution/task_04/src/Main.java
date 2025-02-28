/*
 * Необходимо добавить в класс Student метод вычисляющий средний бал
 * студента, по введенному массиву оценок.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student ivanov = new Student();
        Student petrov = new Student();

        ivanov.numberCourse = 1;
        ivanov.nameStudent = "Ivan";

        petrov.numberCourse = 2;
        petrov.nameStudent = "Petya";

        ivanov.show();
        System.out.println("Средняя оценка: " + ivanov.calculateAverageGrade(scanner));

        petrov.show();
        System.out.println("Средняя оценка: " + petrov.calculateAverageGrade(scanner));

        scanner.close();
    }
}
