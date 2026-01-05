//Implement a Java program that uses streams
// to find the top 3 frequently occurring characters in a given string.
// Input = "find the top three frequently occurring characters"



package org.example;
import java.util.*;
import java.util.stream.*;

public class SetA_3 {

    public static void main(String[] args) {
        String Input = "find the top three frequently occurring characters";

        List<Character> characters = Input.chars()
                .mapToObj(s -> (char) s)
                .filter(s -> s!=' ')
                .collect(Collectors.groupingBy(s->s , Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Comparator.comparingLong(Map.Entry::getValue))
                .limit(3)
                .map(s -> s.getKey())
                .toList();

        System.out.println(characters);
    }

}
