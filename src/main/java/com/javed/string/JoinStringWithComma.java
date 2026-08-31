package com.javed.string;

import java.util.List;
import java.util.stream.Collectors;

public class JoinStringWithComma {

    public static void main(String[] args) {

        List<String> stringList = List.of("javed", "mondal", "java");

        String collect = stringList.stream()
                .collect(Collectors.joining(","));

        System.out.println(collect);
    }
}
