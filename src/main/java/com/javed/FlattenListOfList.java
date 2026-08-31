package com.javed;

import java.util.List;

public class FlattenListOfList {

    public static void main(String[] args) {

        List<List<Integer>> numbers = List.of(
                List.of(1, 2),
                List.of(3, 4),
                List.of(5, 6)
        );

        List<Integer> list = numbers.stream().flatMap(integers -> integers.stream()).toList();

        System.out.println(list);
    }
}
