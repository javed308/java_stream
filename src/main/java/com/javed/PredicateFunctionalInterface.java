package com.javed;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFunctionalInterface {

    public static void main(String[] args) {

        int arr[] = {2,8,9,78,96,25,56,32,12,45,48};

        Predicate<Integer> isEven = num -> num % 2 ==0;

        Arrays.stream(arr)
                .boxed()
                .filter(isEven)
                .forEach(System.out::println);

        List<Integer> list = Arrays.asList(2,8,9,78,96,25,56,32,12,45,48);

        list.stream().filter(isEven).forEach(System.out::println);
    }
}
