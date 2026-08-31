package com.javed.grouping_by;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFreqMaintainOrder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Map<String, Long> map =Arrays.stream(input.split(""))
                .collect(
                        Collectors.groupingBy(
                                Function.identity(),
                                () -> new LinkedHashMap<>(),
                                Collectors.counting()
                        )
                );

        System.out.println(map);
    }




}
