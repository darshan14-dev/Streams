//Assume there's a class Student with name, grade and score as member variables.
// Write a program to sort a list of students using Streams API and Comparator.
// \The sorting order should be first by grade in descending order,
// and within the same grade, by score in ascending order.

package org.example;
import java.util.*;
import java.util.stream.*;

class Student1 {
    private String name;
    private int grade;
    private int score;

    public Student1(String name, int grade, int score) {
        this.name = name;
        this.grade = grade;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return name + " | Grade: " + grade + " | Score: " + score;
    }
}


public class SetB_9 {
    public static void main(String[] args) {
        List<Student1> students = new ArrayList<>();

        students.add(new Student1("Alice", 10, 85));
        students.add(new Student1("Bob", 12, 90));
        students.add(new Student1("Charlie", 10, 95));
        students.add(new Student1("Diana", 12, 80));
        students.add(new Student1("Eve", 11, 88));


       List<String> stud = students.stream()
               .sorted(Comparator.comparingInt(Student1::getGrade).thenComparing(Comparator.comparingInt(Student1::getScore).reversed()))
               .map(Student1::getName)
               .toList();
        System.out.println(stud);
    }
}
