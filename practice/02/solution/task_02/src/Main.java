public class Main {
    public static void main(String[] args) {
        Student ivanov = new Student();
        ivanov.numberCourse = 1;
        ivanov.nameStudent = "Ivan";

        Student petrov = ivanov;

        System.out.println("ivanov: numberCourse = " + ivanov.numberCourse + ", nameStudent = " + ivanov.nameStudent);
        System.out.println("petrov: numberCourse = " + petrov.numberCourse + ", nameStudent = " + petrov.nameStudent);

        ivanov.numberCourse = 2;
        ivanov.nameStudent = "Vasya";

        System.out.println("ivanov: numberCourse = " + ivanov.numberCourse + ", nameStudent = " + ivanov.nameStudent);
        System.out.println("petrov: numberCourse = " + petrov.numberCourse + ", nameStudent = " + petrov.nameStudent);
    }
}
