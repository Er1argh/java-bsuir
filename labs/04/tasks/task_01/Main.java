/**
 * Напишите класс Student, предоставляющий информацию об имени
 * студента методом getName() и о его курсе методом getCourse().
 * <p>
 * Напишите метод printStudents(LinkedList students, int course), который получает список студентов
 * и номер курса и печатает имена тех студентов из списка, которые обучаются на данном курсе.
 * <p>
 * Протестируйте метод (для этого предварительно придется создать
 * десяток объектов класса Student и поместить их в список).
 * <p>
 * Напишите методы union(LinkedList set1, LinkedList set2) и intersect(LinkedList set1, LinkedList set2),
 * реализующие операции объединения и пересечения двух множеств.
 * <p>
 * Протестируйте работу этих методов на двух предварительно заполненных
 * множествах (понадобится написать вспомогательный метод, выводящий все
 * элементы множества на консоль).
 * <p>
 * Реализуйте интерфейс Comparable так, чтобы студенты сортировались по номеру курса.
 * <p>
 * Проверьте работу, используя класс TreeSet.
 */

package tasks.task_01;

import java.util.LinkedList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 1);
        Student s2 = new Student("Bob", 2);
        Student s3 = new Student("Charlie", 3);
        Student s4 = new Student("David", 2);
        Student s5 = new Student("Eve", 1);
        Student s6 = new Student("Alice", 1);

        LinkedList<Student> list1 = new LinkedList<>();
        list1.add(s1);
        list1.add(s2);
        list1.add(s3);

        LinkedList<Student> list2 = new LinkedList<>();
        list2.add(s4);
        list2.add(s5);
        list2.add(s1);
        list2.add(s6);

        printStudents(list1, 2);

        printList("Union of lists:", union(list1, list2));
        printList("Intersection of lists:", intersect(list1, list2));

        System.out.println("\nStudents in TreeSet (sorted by course and name):");
        TreeSet<Student> treeSet = new TreeSet<>();
        treeSet.add(s2);
        treeSet.add(s1);
        treeSet.add(s3);
        treeSet.add(s4);
        treeSet.add(s5);
        treeSet.add(s6);

        for (Student s : treeSet) {
            System.out.println(s.getName() + " - Course " + s.getCourse());
        }
    }

    public static void printStudents(LinkedList<Student> students, int course) {
        System.out.println("Students from course " + course + ":");

        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static LinkedList<Student> union(LinkedList<Student> set1, LinkedList<Student> set2) {
        LinkedList<Student> result = new LinkedList<>();

        for (Student student : set1) {
            if (!result.contains(student)) {
                result.add(student);
            }
        }

        for (Student student : set2) {
            if (!result.contains(student)) {
                result.add(student);
            }
        }

        return result;
    }

    public static LinkedList<Student> intersect(LinkedList<Student> set1, LinkedList<Student> set2) {
        LinkedList<Student> result = new LinkedList<>();

        for (Student student : set1) {
            if (set2.contains(student)) {
                result.add(student);
            }
        }

        return result;
    }

    public static void printList(String message, LinkedList<Student> students) {
        System.out.println("\n" + message);

        for (Student student : students) {
            System.out.println(student.getName() + " - course " + student.getCourse());
        }
    }
}
