//Consider a list of people with name, city and age.
// Using Java streams, how would you sort the list first by age in ascending order,
// and in case of tie, sort by name in descending order?

package org.example;
import java.util.*;
import java.util.stream.*;
class Person {
    private String name;
    private String city;
    private int age;

    public Person(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " | " + city + " | " + age;
    }
}


public class SetB_8 {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Alice", "New York", 25));
        people.add(new Person("Bob", "Los Angeles", 30));
        people.add(new Person("Charlie", "Chicago", 25));
        people.add(new Person("Diana", "Houston", 35));
        people.add(new Person("Eve", "New York", 30));


        List<Person> sorted = people.stream()
                .sorted(Comparator.comparingInt(Person::getAge).thenComparing(Comparator.comparing(Person::getName).reversed()))
                .toList();

        System.out.println("sorted: " + sorted);
    }

}
