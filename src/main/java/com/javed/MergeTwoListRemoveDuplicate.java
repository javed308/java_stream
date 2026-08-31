package com.javed;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class MergeTwoListRemoveDuplicate {

    public static void main(String[] args) {

        List<Integer> list1 = List.of(1, 2, 3, 4);
        List<Integer> list2 = List.of(3, 4, 5, 6,7);

        List<Integer> list = Stream.concat(list1.stream(), list2.stream()).distinct().toList();

        Function<String, Integer> length = str -> str.length();

        String str = "javed";

        System.out.println(length.apply(str));

        System.out.println(list);
    }
}
