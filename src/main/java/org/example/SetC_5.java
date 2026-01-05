//You work for an airline company which has a list of flights,
// each flight having a list of passengers.
// For an audit, you need to generate a list of all passengers names in uppercase.


package org.example;
import java.util.*;
import java.util.stream.*;
import java.util.*;

class Passenger {
    String name;

    Passenger(String name) {
        this.name = name;
    }
}

class Flight {
    String flightNumber;
    List<Passenger> passengers;

    Flight(String flightNumber, List<Passenger> passengers) {
        this.flightNumber = flightNumber;
        this.passengers = passengers;
    }
}

public class SetC_5 {

    static List<String> getAllPassengerNamesUppercase(List<Flight> flights) {
        return flights.stream()
                .flatMap( f -> f.passengers.stream())
                .map(p -> p.name.toUpperCase())
                .toList();
    }

    public static void main(String[] args) {

        Flight flight1 = new Flight(
                "AI101",
                Arrays.asList(
                        new Passenger("Alice"),
                        new Passenger("Bob")
                )
        );

        Flight flight2 = new Flight(
                "AI202",
                Arrays.asList(
                        new Passenger("Charlie"),
                        new Passenger("Diana")
                )
        );

        Flight flight3 = new Flight(
                "AI303",
                Arrays.asList(
                        new Passenger("Ethan"),
                        new Passenger("Fiona")
                )
        );

        List<Flight> flights = new ArrayList<>();
        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);


        List<String> passengerNames = getAllPassengerNamesUppercase(flights);

        System.out.println(passengerNames);
    }
}
