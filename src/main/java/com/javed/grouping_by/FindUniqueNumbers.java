package com.javed.grouping_by;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindUniqueNumbers {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(4,5,5,6,8,6,23,3,2,3);

        List<Integer> uniList = list.stream()
                .collect(
                        Collectors.groupingBy(
                                Function.identity(), () -> new LinkedHashMap<>(), Collectors.counting()
                        )
                ).entrySet()
                .stream()
                .filter(integerLongEntry -> integerLongEntry.getValue() == 1)
                .map(integerLongEntry -> integerLongEntry.getKey())
                .collect(Collectors.toList());

        System.out.println(uniList);
    }
}
