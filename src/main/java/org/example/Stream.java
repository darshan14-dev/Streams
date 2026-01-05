package org.example;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;
class Stream{
    
    public static void main(String[] args){

        List<Integer> nums = Arrays.asList(1,44,55,2,6,3,44,55,66,77,99,88,0,1,3);

       // 1) Find max number
        
        int maxNum = nums.stream()
                .max(Comparator.naturalOrder())
                .orElse(-1);
        System.out.println(maxNum);





        //2) Find Min number

//        int minNum = nums.stream()
//                .min(Comparator.naturalOrder())
//                .get();
//        System.out.println(minNum);





        //3) Sort in ascending order
//
//        List<Integer> sortedAsc = nums.stream()
//                .sorted((a,b)->a-b)
//                .toList();
//        System.out.println(sortedAsc);




        //4)Sort in descending order
//        List<Integer> listDesc = nums.stream()
//                .sorted(Comparator.reverseOrder())
//                .toList();
//        System.out.println(listDesc);




//        5)Unique elements from list

//        List<Integer> unique = nums.stream()
//                        .collect(Collectors.groupingBy(n -> n,Collectors.counting()))
//                                .entrySet().stream()
//                        .filter(entry -> entry.getValue() == 1)
//                .map(entry -> entry.getKey())
//                                .collect(Collectors.toList());
//        System.out.println(unique);


//        6)Duplicate elements from list

//        List<Integer> dubs = nums.stream()
//                .collect(Collectors.groupingBy(n->n, Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(entry -> entry.getValue()>1)
//                .map(Map.Entry::getKey)
//                .toList();
//        System.out.println(dubs);

//        7)Largest possible number formation from given list
//        List<Integer> nums = Arrays.asList(34, 30, 9, 5, 3);
//        String num = nums.stream()
//                .map(n -> String.valueOf(n))
//                .sorted((a,b)->(b+a).compareTo(a+b))
//                .reduce("", String::concat);
//
//        BigInteger ans = new BigInteger(num);
//        System.out.println(ans);


        //8)smallest possible number formation from given list
//        String num = nums.stream()
//                .map(n->String.valueOf(n))
//                .sorted((a,b)->(a+b).compareTo(b+a))
//                .collect(Collectors.joining());
//
//        BigInteger bigInteger = new BigInteger(num);
//        System.out.println(bigInteger);

        //9) find the minimum element from target
//        int target = 55;
//        int num = nums.stream()
//                .min(Comparator.comparing(n-> Math.abs(target-n)))
//                .orElse(-1);
//        System.out.println(num);

//        10)Print square of even numbers

//        List<Integer> evenSquare =  nums.stream()
//                .filter(n -> n%2 == 0)
//                .map(n -> n*n)
//                .toList();
//
//        System.out.println(evenSquare);

//        11)Print cube of odd numbers
//        List<Integer> oddCube = nums.stream()
//                .filter(n -> n%2 != 0)
//                .map(n->n*n*n)
//                .toList();
//
//        System.out.println(oddCube);

        //12)Print elements divisible by 11
//        List<Integer> divisibleByEleven = nums.stream()
//                .filter(n -> n%11 == 0)
//                .toList();
//        System.out.println(divisibleByEleven);

        //13)Count of duplicates
//        long num = nums.stream()
//                .collect(Collectors.groupingBy(n->n,Collectors.counting()))
//                .entrySet().stream()
//                .filter(entry -> entry.getValue()>1)
//                .count();
//        System.out.println(num);

        //14)Count of unique elements
//        long count = nums.stream()
//                .collect(Collectors.groupingBy(n->n,Collectors.counting()))
//                .entrySet().stream()
//                .filter(entry -> entry.getValue() == 1)
//                .count();
//
//        System.out.println(count);

        //15) Skip first 3 elements if number is more than 5
//

        //16)Limit to 3 elements if number is more than 35

    }





}