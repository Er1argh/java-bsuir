import java.util.Scanner;

public class Student {
    private int numberCourse;
    private String nameStudent;

    public Student() {
        numberCourse = 1;
        nameStudent = "Ivan";
    }

    public void show() {
        System.out.println("numberCourse = " + numberCourse + ", nameStudent = " + nameStudent);
    }

    public double calculateAverageGrade(int[] grades) {
        int gradesSum = 0;

        for (int i = 0; i < grades.length; i++) {
            gradesSum += grades[i];
        }

        return (double) gradesSum / grades.length;
    }
}
