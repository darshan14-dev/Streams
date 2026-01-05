////Given a list of orders where each order has an ID, a date, and an amount.
//// Write a Java program that uses streams to filter out
//// all orders that were made in the last month and have an amount greater than a specific value.
//
//package org.example;
//import java.util.*;
//import java.util.stream.*;
//
//import java.time.LocalDate;
//
//class Order {
//    private int id;
//    private LocalDate date;
//    private double amount;
//
//    // Constructor
//    public Order(int id, LocalDate date, double amount) {
//        this.id = id;
//        this.date = date;
//        this.amount = amount;
//    }
//
//    // Getters
//    public int getId() {
//        return id;
//    }
//
//    public LocalDate getDate() {
//        return date;
//    }
//
//    public double getAmount() {
//        return amount;
//    }
//
//    // toString() for easy printing
//    @Override
//    public String toString() {
//        return "Order ID: " + id + " | Date: " + date + " | Amount: " + amount;
//    }
//}
//
//
//public class SetB_10 {
//    public static void main(String[] args) {
//        List<Order> orders = new ArrayList<>();
//
//        orders.add(new Order(101, LocalDate.of(2025, 12, 5), 250.0));
//        orders.add(new Order(102, LocalDate.of(2025, 11, 20), 180.0));
//        orders.add(new Order(103, LocalDate.of(2025, 12, 1), 300.0));
//        orders.add(new Order(104, LocalDate.of(2025, 10, 15), 500.0));
//        orders.add(new Order(105, LocalDate.of(2025, 12, 3), 120.0));
//
//
//        List<Order> list = orders.stream()
//                .filter(s -> LocalDate.now().getMonth() - s.getDate().getMonth() == 1 && s.getAmount()>200)
//                .toList();
//    }
//}
