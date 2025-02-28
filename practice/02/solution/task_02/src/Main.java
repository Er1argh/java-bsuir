/*
 * Необходимо создать в классе Student объект – petrov просто присвоив ему
 * ivanov. Вывести данные про оба объекта. Затем изменить данные через ссылку
 * ivanov и снова вывести данные. Проанализировать полученные результаты.
 */

public class Main {
    public static void main(String[] args) {
        Student ivanov = new Student();
        Student petrov = ivanov;

        ivanov.numberCourse = 1;
        ivanov.nameStudent = "Ivan";

        System.out.println("ivanov: numberCourse = " + ivanov.numberCourse + ", nameStudent = " + ivanov.nameStudent
                + "\npetrov: numberCourse = " + petrov.numberCourse + ", nameStudent = " + petrov.nameStudent);

        ivanov.numberCourse = 2;
        ivanov.nameStudent = "Vasya";

        System.out.println("ivanov: numberCourse = " + ivanov.numberCourse + ", nameStudent = " + ivanov.nameStudent
                + "\npetrov: numberCourse = " + petrov.numberCourse + ", nameStudent = " + petrov.nameStudent);
    }
}
