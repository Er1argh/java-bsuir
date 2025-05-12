package tasks.task_01;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private final String name;
    private final int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public int compareTo(Student other) {
        int courseCompare = Integer.compare(this.course, other.course);

        return courseCompare != 0 ? courseCompare : this.name.compareTo(other.name);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Student student = (Student) object;

        return course == student.course && Objects.equals(name, student.name);
    }

    public int hashCode() {
        return Objects.hash(name, course);
    }
}
