package com.javed;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllElementStartWith_1 {

    public static void main(String[] args) {

        /*
        Find element from array who start with 1
         */

        int arr[] ={5, 9, 11, 45, 21, 56, 213, 4, 89, 1};

        List<String> stringList = Arrays.stream(arr).boxed()
                .map(s -> s + "")
                .filter(s -> s.startsWith("1"))
                .collect(Collectors.toList());

        System.out.println(stringList);

    }
}
