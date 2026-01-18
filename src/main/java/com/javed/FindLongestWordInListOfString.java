package com.javed;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindLongestWordInListOfString {

    public static void main(String[] args) {
        List<String> stringList = List.of("Hello", "World", "India");

        Optional<String> longest = stringList.stream().max(Comparator.comparingInt(s->s.length()));

        System.out.println(longest.get());
    }



}
