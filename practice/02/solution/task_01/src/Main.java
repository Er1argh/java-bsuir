/*
 * Необходимо создать класс Student, в котором будут объявлены поля
 * (переменные экземпляра) класса – numberCourse, nameStudent. Создать второй
 * класс Main, в котором будет создан объект ivanov. Занести данные в поля и
 * вывести их. Создать в классе Main второй объект – petrov. Занести для него
 * значения в поля. Вывести данные для обоих объектов.
 */

public class Main {
    public static void main(String[] args) {
        Student ivanov = new Student();
        Student petrov = new Student();

        ivanov.numberCourse = 1;
        ivanov.nameStudent = "Ivan";

        petrov.numberCourse = 2;
        petrov.nameStudent = "Petya";

        System.out.println("ivanov: numberCourse = " + ivanov.numberCourse + ", nameStudent = " + ivanov.nameStudent
                + "\npetrov: numberCourse = " + petrov.numberCourse + ", nameStudent = " + petrov.nameStudent);
    }
}
