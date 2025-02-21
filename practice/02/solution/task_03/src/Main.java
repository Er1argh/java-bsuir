public class Main {
    public static void main(String[] args) {
        Student ivanov = new Student();
        ivanov.numberCourse = 1;
        ivanov.nameStudent = "Ivan";

        Student petrov = new Student();
        petrov.numberCourse = 2;
        petrov.nameStudent = "Petya";

        ivanov.show();
        petrov.show();
    }
}
