/*
 * Необходимо создать класс Student, содержащий следующие
 * характеристики – имя, группа, курс, оценки по предметам. Создать коллекцию,
 * содержащую объекты класса Student. Написать метод, который удаляет
 * студентов со средним баллом <4. Если средний балл >=4, студент переводится
 * на следующий курс. Написать метод printStudents(List<Student> students, int
 * course), который получает список студентов и номер курса, а также печатает на
 * консоль имена тех студентов из списка, которые обучаются на данном курсе.
 */

package tasks.task_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", "Group-1", 1, Arrays.asList(3, 4, 3)));
        students.add(new Student("Bob", "Group-2", 2, Arrays.asList(4, 5, 4)));
        students.add(new Student("Alex", "Group-3", 3, Arrays.asList(5, 5, 5)));

        System.out.println("До обработки:");
        printAllStudents(students);

        System.out.println("\nПосле обработки:");
        removeUnderperformingStudents(students);
        printAllStudents(students);

        System.out.println("\nСтуденты на 3-м курсе:");
        printStudents(students, 3);
    }

    private static void printAllStudents(List<Student> students) {
        for (Student student : students) {
            System.out.printf("Имя: %s, Курс: %d, Средний балл: %.2f%n", student.getName(), student.getCourse(), student.getAverageGrade());
        }
    }

    public static void removeUnderperformingStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();
            double avg = student.getAverageGrade();

            if (avg < 4.0) {
                iterator.remove();
            } else {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}
