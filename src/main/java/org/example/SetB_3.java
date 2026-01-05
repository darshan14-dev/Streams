
//Take a range of number between 100 and 200
// doubling each of them
// and find the first number which is evenly divisble by 3
package org.example;
import java.util.*;
import java.util.stream.*;

public class SetB_3 {
    public static void main(String[] args) {

        int num = IntStream.rangeClosed(100,200)
                .map(i -> i*2)
                .filter(i -> i%2 == 0 && i%3 == 0)
                .findFirst()
                .orElse(-1);
        System.out.println(num);
    }
}
