public class Main {
    public static void main(String[] args) {
        Student ivanov = new Student();
        ivanov.numberCourse = 1;
        ivanov.nameStudent = "Ivan";
        System.out.println("ivanov: numberCourse = " + ivanov.numberCourse + ", nameStudent = " + ivanov.nameStudent);

        Student petrov = new Student();
        petrov.numberCourse = 2;
        petrov.nameStudent = "Petya";
        System.out.println("petrov: numberCourse = " + petrov.numberCourse + ", nameStudent = " + petrov.nameStudent);
    }
}
