//Working for an online course platform,
// you've a list of courses,
// and each course has a list of enrolled students.
// You want to create a list of students who are under 21 for a certain promotion,
// converted into a specific string format.

package org.example;
import java.util.*;
import java.util.stream.*;


class Course {
    String courseName;
    List<Student> students;

    Course(String courseName, List<Student> students) {
        this.courseName = courseName;
        this.students = students;
    }
}

public class SetC_3 {


    public static void main(String[] args) {

        Course course1 = new Course(
                "Java Basics",
                Arrays.asList(
                        new Student("Alice", 19),
                        new Student("Bob", 22)
                )
        );

        Course course2 = new Course(
                "Spring Boot",
                Arrays.asList(
                        new Student("Charlie", 20),
                        new Student("Diana", 23)
                )
        );

        Course course3 = new Course(
                "Data Structures",
                Arrays.asList(
                        new Student("Ethan", 18),
                        new Student("Fiona", 21)
                )
        );

        List<Course> courses = new ArrayList<>();
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);

        List<String> result = courses.stream()
                .flatMap(s -> s.students.stream())
                .map( s -> s.getName())
                .toList();

        System.out.println(result);
    }




}

