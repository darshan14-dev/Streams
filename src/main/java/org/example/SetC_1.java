//You are a software engineer and have a list of software Modules,
// each module has a list of Tasks. To evaluate the work distribution,
// you are asked to
// compile a list of all tasks with estimates rounded to nearest hour.

package org.example;
import java.util.*;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Task {
    String title;
    double estimate;

    Task(String title, double estimate) {
        this.title = title;
        this.estimate = estimate;
    }
}

class Module {
    String name;
    List<Task> tasks;

    Module(String name, List<Task> tasks) {
        this.name = name;
        this.tasks = tasks;
    }
}

public class SetC_1 {
    public static void main(String[] args) {

        Module moduleA = new Module(
                "Authentication",
                Arrays.asList(
                        new Task("Login API", 2.3),
                        new Task("Signup API", 3.7)
                )
        );

        Module moduleB = new Module(
                "Dashboard",
                Arrays.asList(
                        new Task("UI Layout", 4.2),
                        new Task("Charts Integration", 1.8)
                )
        );

        Module moduleC = new Module(
                "Payments",
                Arrays.asList(
                        new Task("Payment Gateway", 5.5),
                        new Task("Invoice Generation", 2.9)
                )
        );

        Module moduleD = new Module(
                "Notifications",
                Arrays.asList(
                        new Task("Email Service", 1.4),
                        new Task("Push Notifications", 2.6)
                )
        );

        Module moduleE = new Module(
                "Reporting",
                Arrays.asList(
                        new Task("Monthly Report", 3.2),
                        new Task("Export to CSV", 1.1)
                )
        );

        List<Module> modules = new ArrayList<>();
        modules.add(moduleA);
        modules.add(moduleB);
        modules.add(moduleC);
        modules.add(moduleD);
        modules.add(moduleE);


        double estimated = modules.stream()
                .flatMap(m -> m.tasks.stream())
                .collect(Collectors.summingDouble(t -> t.estimate));

        System.out.println(Math.ceil(estimated));




    }
}

