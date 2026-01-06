//In a school management system,
// you have list of teachers,
// each teacher has a list of students.
// Now, you need to group students first by grade and then by division.

package org.example;
import java.util.*;
import java.util.stream.*;

class Stud{
    String name;
    String grade;
    String division;

    Stud(String n,String g,String d){
        this.name=n;
        this.grade=g;
        this.division=d;
    }

    public String getName(){
        return this.name;
    }
    public String getGrade(){
        return this.grade;
    }
    public String getDivision(){
        return this.division;
    }
}

class Teacher {
    String name;
    List<Stud> students;

    Teacher(String n){
        this.name=n;
        this.students = new ArrayList<>();
    }
}

public class SetD_3 {
    public static void main(String[] args) {

        // Teacher 1
        Teacher t1 = new Teacher("Mr. Sharma");
        t1.students.add(new Stud("Amit", "10", "A"));
        t1.students.add(new Stud("Riya", "10", "B"));
        t1.students.add(new Stud("Karan", "9", "A"));

        // Teacher 2
        Teacher t2 = new Teacher("Ms. Patil");
        t2.students.add(new Stud("Sneha", "9", "B"));
        t2.students.add(new Stud("Rahul", "10", "A"));
        t2.students.add(new Stud("Pooja", "8", "C"));

        Teacher t3 = new Teacher("Mr. Khan");
        t3.students.add(new Stud("Arjun", "8", "A"));
        t3.students.add(new Stud("Neha", "9", "C"));


        List<Teacher> teachers = Arrays.asList(t1, t2, t3);


        Map<String, Map<String, List<String>>> mp = teachers.stream()
                .flatMap(t -> t.students.stream())
                .collect(Collectors.groupingBy(s -> s.grade,Collectors.groupingBy(s -> s.division,Collectors.mapping(
                        Stud::getName,
                        Collectors.toList()

                ))));


        System.out.println(mp);



    }
}
