package com.javed.grouping_by;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFreq {

    public static void main(String[] args) {

        String s = "javedmondal";

         Map<Character, Long> map = s.chars().mapToObj(e -> (char) (e))
                .collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );

    }


}
