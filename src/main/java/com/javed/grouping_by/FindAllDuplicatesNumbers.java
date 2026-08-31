package com.javed.grouping_by;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindAllDuplicatesNumbers {

    public static void main(String[] args) {

        int arr[] = {4, 5, 89, 6, 23, 45,4,6,89, 62, 78, 895,23};

        List<Integer> collect = Arrays.stream(arr).boxed()
                .collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                ).entrySet()
                .stream().filter(integerLongEntry -> integerLongEntry.getValue()>1)
                .map(integerLongEntry -> integerLongEntry.getKey())
                .collect(Collectors.toList());

        System.out.println(collect);

    }
}
