package com.javed.grouping_by;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

         java.util.Optional<Character> firstNonRepeatedChar =input.chars().mapToObj(e -> (char) e)
                .collect(
                        Collectors.groupingBy(
                                Function.identity(),
                                () -> new LinkedHashMap<>(),
                                Collectors.counting()
                        )
                )
                .entrySet()
                .stream()
                .filter(characterLongEntry -> characterLongEntry.getValue() >1)
                 .map(characterLongEntry -> characterLongEntry.getKey())
                .findFirst();

         firstNonRepeatedChar.ifPresent(c-> System.out.println(c));
    }
}
