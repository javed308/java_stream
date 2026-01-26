package com.javed;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class SortListOfIntegerDescendingOrder {

    public static void main(String[] args) {

        List<Integer> list = List.of(5, 2, 9, 1, 7);


        // one way
        //List<Integer> descOrderList = list.stream().sorted(Comparator.reverseOrder()).toList();

        // 2nd way (explicit comparator)
        //List<Integer> descOrderList = list.stream().sorted((a,b) -> b.compareTo(a)).toList();


        // handel null value
        List<Integer> descOrderList = list.stream().filter(Objects::nonNull)
                .sorted(Comparator.reverseOrder())
                        .toList();

        System.out.println(descOrderList);
    }
}
