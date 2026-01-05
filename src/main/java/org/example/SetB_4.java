//1) Given a List<String> strings = Arrays.asList("this", "is", "a", "long", "list", "of",
//        "strings", "to", "use", "as", "a", "demo");
//        Partition the list by even or odd length.

//2)Change the above ( 4) to return the count of even or odd length string

package org.example;
import java.util.*;
import java.util.stream.*;
public class SetB_4 {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("this", "is", "a", "long", "list", "of", "strings", "to", "use", "as", "a", "demo");


        // ---------------- 1-----------------
        Map<String,List<String>> list = strings.stream()
                .collect(Collectors.groupingBy(s -> s.length()%2 == 0 ? "Even" : "Odd"));

        System.out.println(list);

        // -------------------- 2-----------------
        Map<String,Long> listCount = strings.stream()
                .collect(Collectors.groupingBy(s -> s.length()%2 == 0 ? "Even" : "Odd", Collectors.counting()));

        System.out.println(listCount);
    }

}
