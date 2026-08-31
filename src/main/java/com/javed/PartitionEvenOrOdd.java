package com.javed;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionEvenOrOdd {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        Map<Boolean, List<Integer>> collect = numbers.stream()
                .collect(
                        Collectors.partitioningBy(n -> n % 2 == 0)

                );

        System.out.println(collect);
    }
}
