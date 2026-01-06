//In an e-commerce application,
// you have a list of users, and each user has a list of orders.
// For a marketing study,
// you need to group all orders
// according to their order status and also provide the count.

package org.example;
import java.util.*;
import java.util.stream.*;

import static java.util.Map.*;


enum OrderStatus {
    PENDING,
    SHIPPED,
    DELIVERED,
    CANCELLED
}

// Order class
class Orders {
    private int orderId;
    private OrderStatus status;
    private double amount;

    public Orders(int orderId, OrderStatus status, double amount) {
        this.orderId = orderId;
        this.status = status;
        this.amount = amount;
    }

    public int getOrderId() {
        return orderId;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", status=" + status +
                ", amount=" + amount +
                '}';
    }
}

// User class
class User {
    private int userId;
    private String name;
    private List<Orders> orders;

    public User(int userId, String name, List<Orders> orders) {
        this.userId = userId;
        this.name = name;
        this.orders = orders;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", orders=" + orders +
                '}';
    }
}

public class SetD_4 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User(1, "Alice", Arrays.asList(
                new Orders(101, OrderStatus.PENDING, 250.0),
                new Orders(102, OrderStatus.SHIPPED, 150.0)
        )));

        users.add(new User(2, "Bob", Arrays.asList(
                new Orders(103, OrderStatus.DELIVERED, 300.0),
                new Orders(104, OrderStatus.CANCELLED, 200.0),
                new Orders(105, OrderStatus.SHIPPED, 100.0)
        )));

        users.add(new User(3, "Charlie", Arrays.asList(
                new Orders(106, OrderStatus.PENDING, 500.0),
                new Orders(107, OrderStatus.DELIVERED, 400.0)
        )));


        Map<String, List<Orders>> mp = users.stream()
                .flatMap(u -> u.getOrders().stream())
                .collect(Collectors.groupingBy( o -> String.valueOf(o.getStatus())));

        Map<String, Map<Integer, List<Orders>>> details =
                mp.entrySet()
                        .stream()
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                e -> Map.of(e.getValue().size(), e.getValue())
                        ));

        System.out.println(details);
    }
}
