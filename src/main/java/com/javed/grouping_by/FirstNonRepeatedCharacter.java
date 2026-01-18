package com.javed.grouping_by;

import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

//        LinkedHashMap<Character, Long> map = input.chars().mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(c -> c, () -> new LinkedHashMap<>(), Collectors.counting()));

        Optional<Character> firstNonrepeatedCharacter = input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, () -> new LinkedHashMap<>(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(m -> m.getKey())
                .findFirst();

        firstNonrepeatedCharacter.ifPresent(c -> System.out.println("First non repeated character is : " + c));

    }
}
