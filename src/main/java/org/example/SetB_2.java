package org.example;

import java.util.*;
import java.util.stream.*;
public class SetB_2 {

    public static void main(String[] args) {
        String pal = "eye";

           long count = IntStream.range(0,pal.length()/2)
                    .filter(i -> pal.charAt(i) == pal.charAt(pal.length()-1-i))
                    .count();

        System.out.println(count == pal.length() / 2);
    }
}
