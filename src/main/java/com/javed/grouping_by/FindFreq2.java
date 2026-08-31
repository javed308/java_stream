package com.javed.grouping_by;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFreq2 {

    public static void main(String[] args) {

        String input = "I love Java";

        Map<String, Long> map = Arrays.stream(input.split(""))
                .filter(s -> !s.equals(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map);

    }
}
