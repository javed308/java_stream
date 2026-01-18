package com.javed.grouping_by;

import com.javed.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy_Example {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 30),
                new Person("David", 25),
                new Person("Eve", 35)
        );

        Map<Integer, List<Person>> map = people.stream().collect(Collectors.groupingBy(Person::getAge));

        System.out.println(map);
    }
}
