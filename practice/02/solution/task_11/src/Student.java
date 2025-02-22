import java.util.Scanner;

public class Student {
    public int numberCourse;
    public String nameStudent;

    public Student(int numberCourse, String nameStudent) {
        this.numberCourse = numberCourse;
        this.nameStudent = nameStudent;
    }

    public Student(Student student) {
        this.numberCourse = student.numberCourse;
        this.nameStudent = student.nameStudent;
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
