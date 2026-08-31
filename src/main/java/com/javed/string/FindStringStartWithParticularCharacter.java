package com.javed.string;

import java.util.List;

public class FindStringStartWithParticularCharacter {

    public static void main(String[] args) {

        List<String> stringList = List.of("javed", "mondal", "java");

        char ch = 'j';

        List<String> list = stringList.stream()
                .filter(s -> s.startsWith(String.valueOf(ch)))
                .toList();

        System.out.println(list);
    }
}