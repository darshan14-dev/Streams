//Convert  a stream of int to a list of Integer

package org.example;
import java.util.*;
import java.util.List;


public class SetB_1 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        List<Integer> list = Arrays.stream(arr)
                .boxed()
                .toList();

        System.out.println(list);
    }


}
