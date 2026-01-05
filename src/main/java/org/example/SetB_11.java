//You have a stream of sentences and you want to create a stream of all individual
// words in all sentences.

package org.example;
import java.util.*;
import java.util.stream.*;

public class SetB_11 {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("how are you","how was your day");

        List<String> words = sentences.stream()
                .flatMap(s -> Arrays.stream(s.split("\\s")))
                .toList();
        System.out.println(words);

    }
}
