/*
 * Создайте пример наследования, реализуйте класс Student и класс
 * Magistracy, магистрант отличается от студента наличием некой научной работы.
 * Класс Student должен содержать поля: String firstName, lastName, group. А
 * также, double averageMark, содержащее среднюю оценку. Создайте переменную
 * типа Student, которая ссылается на объект типа Magistracy. Создайте метод
 * getScholarship() для класса Student, который возвращает сумму стипендии. Если
 * средняя оценка студента равна 8, то сумма 100 руб., иначе 80 руб.
 * Переопределите этот метод в классе Magistracy. Если средняя оценка аспиранта
 * равна 8, то сумма 200 руб., иначе 180 руб. Создайте массив типа Student,
 * содержащий объекты класса Student и Magistracy. Вызовите метод
 * getScholarship() для каждого элемента массива.
 */

public class Main {
    public static void main(String[] args) {
        Student studentRef = new Magistracy("Алексей", "Алексеев", "Группа 5", 8.5, "Исследование машинного обучения");
        Student[] students = {
                new Student("Иван", "Иванов", "Группа 1", 7.5),
                new Magistracy("Петр", "Петров", "Группа 2", 8, "Исследование AI"),
                new Student("Сергей", "Сергеев", "Группа 3", 8),
                new Magistracy("Анна", "Антонова", "Группа 4", 7, "Анализ данных")
        };

        System.out.println(studentRef.getFirstName() + " " + studentRef.getLastName() + " получает стипендию: " + studentRef.getScholarship() + " руб.");

        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + " получает стипендию: " + student.getScholarship() + " руб.");
        }
    }
}
