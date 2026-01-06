//In a university management system,
// there is a list of departments, each department has a list of professors.
// Now, you want to find the count of professors
// in each department who have a PhD degree.


package org.example;
import java.util.*;
import java.util.stream.*;

class Professor {
    String name;
    boolean hasPhD;

    Professor(String name, boolean hasPhD) {
        this.name = name;
        this.hasPhD = hasPhD;
    }
}

class Department {
    String name;
    List<Professor> professors;

    Department(String name) {
        this.name = name;
        this.professors = new ArrayList<>();
    }

    void addProfessor(Professor p) {
        professors.add(p);
    }
}

public class SetD_1 {
    public static void main(String[] args) {
        Department computer = new Department("Computer");
        computer.addProfessor(new Professor("Alice", true));
        computer.addProfessor(new Professor("Bob", false));
        computer.addProfessor(new Professor("Charlie", true));
        computer.addProfessor(new Professor("Diana", true));
        computer.addProfessor(new Professor("Ethan", false));

        Department mechanical = new Department("Mechanical");
        mechanical.addProfessor(new Professor("Frank", true));
        mechanical.addProfessor(new Professor("Grace", true));
        mechanical.addProfessor(new Professor("Hank", false));
        mechanical.addProfessor(new Professor("Ivy", false));

        Department electrical = new Department("Electrical");
        electrical.addProfessor(new Professor("Jack", true));
        electrical.addProfessor(new Professor("Karen", true));
        electrical.addProfessor(new Professor("Leo", true));
        electrical.addProfessor(new Professor("Mona", false));

        List<Department> departments = new ArrayList<>();
        departments.add(computer);
        departments.add(mechanical);
        departments.add(electrical);

        List<String> professors = departments.stream()
                .flatMap(d -> d.professors.stream())
                .filter( p -> p.hasPhD)
                .map(p -> p.name)
                .toList();

        System.out.println(professors);
    }
}
