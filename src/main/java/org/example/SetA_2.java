package org.example;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', grade=" + grade + "}";
    }

    public static List<Student> getStudents() {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 90));
        students.add(new Student("Charlie", 85));
        students.add(new Student("David", 95));
        students.add(new Student("Eve", 90));
        students.add(new Student("Frank", 75));

        return students;
    }
}


public class SetA_2 {

    public static void main(String[] args) {
        List<Student> students = Student.getStudents();

        List<String> sort = students.stream()
                .sorted(Comparator.comparingInt(Student::getGrade).reversed().thenComparing(Student::getName))
                .map(s -> s.getName())
                .toList();
        System.out.println(sort);
    }

}
