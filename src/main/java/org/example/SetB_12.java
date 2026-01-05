//You have a stream of customers where each Customer instance has a List of Orders.
// You need to create a single stream of all orders from all customers.

package org.example;
import java.util.*;
import java.util.stream.*;

import java.util.List;

import java.time.LocalDate;

class Order {
    private int id;
    private LocalDate date;
    private double amount;

    public Order(int id, LocalDate date, double amount) {
        this.id = id;
        this.date = date;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Order ID: " + id + " | Date: " + date + " | Amount: " + amount;
    }
}


class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name, List<Order> orders) {
        this.name = name;
        this.orders = orders;
    }

    public String getName() {
        return name;
    }

    public List<Order> getOrders() {
        return orders;
    }

    @Override
    public String toString() {
        return name + " | Orders: " + orders.size();
    }
}



public class SetB_12 {
    public static void main(String[] args) {
        List<Order> orders1 = Arrays.asList(
                new Order(101, LocalDate.of(2025, 12, 5), 250.0),
                new Order(102, LocalDate.of(2025, 12, 10), 300.0)
        );

        List<Order> orders2 = Arrays.asList(
                new Order(103, LocalDate.of(2025, 11, 20), 150.0),
                new Order(104, LocalDate.of(2025, 12, 1), 400.0)
        );

        List<Order> orders3 = Arrays.asList(
                new Order(105, LocalDate.of(2025, 12, 3), 120.0)
        );

        List<Customer> customers = Arrays.asList(
                new Customer("Alice", orders1),
                new Customer("Bob", orders2),
                new Customer("Charlie", orders3)
        );


        List<Order> allOrders = customers.stream()
                .flatMap(s -> s.getOrders().stream())
                .toList();

        System.out.println(allOrders);
    }
}
