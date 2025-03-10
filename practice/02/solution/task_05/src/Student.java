import java.util.Scanner;

public class Student {
    public int numberCourse;
    public String nameStudent;

    public void show() {
        System.out.println("numberCourse = " + numberCourse + ", nameStudent = " + nameStudent);
    }

    public double calculateAverageGrade(Scanner scanner, int[] grades) {
        int gradesSum = 0;

        for (int i = 0; i < grades.length; i++) {
            gradesSum += grades[i];
        }

        return (double) gradesSum / grades.length;
    }
}
