package com.javed;

import java.util.Arrays;
import java.util.Comparator;

public class FIndSecondHighestNumber {

    public static void main(String[] args) {

        int arr[] = {5, 9, 11, 45, 21, 56, 213, 4, 89};

        Integer secondHighestNumber = Arrays.stream(arr).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(secondHighestNumber);
    }


}
