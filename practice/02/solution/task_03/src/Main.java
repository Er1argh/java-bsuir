/*
 * Необходимо создать в классе Student метод выводящий параметры студента
 * на консоль (тип возвращаемого значения у метода void).
 */

public class Main {
    public static void main(String[] args) {
        Student ivanov = new Student();
        Student petrov = new Student();

        ivanov.numberCourse = 1;
        ivanov.nameStudent = "Ivan";

        petrov.numberCourse = 2;
        petrov.nameStudent = "Petya";

        ivanov.show();
        petrov.show();
    }
}
