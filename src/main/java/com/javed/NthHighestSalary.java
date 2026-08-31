package com.javed;

import java.util.*;
import java.util.stream.Collectors;

public class NthHighestSalary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Map<String, Integer> salaryMap = new HashMap<>();

        salaryMap.put("Amit", 65000);
        salaryMap.put("Rahul", 60000);
        salaryMap.put("Priya", 55000);
        salaryMap.put("Neha", 55000);
        salaryMap.put("Rohan", 65000);
        salaryMap.put("Sneha", 68000);
        salaryMap.put("Arjun", 75000);
        salaryMap.put("Pooja", 68000);
        salaryMap.put("Vikas", 75000);
        salaryMap.put("Anjali", 68000);

        Optional<Map.Entry<Integer, List<String>>> nthHighestSalaryOptional = getNthHighestSalary2(num, salaryMap);
        if(nthHighestSalaryOptional.isPresent()) {
            System.out.println(nthHighestSalaryOptional.get());
        }else{
            System.out.println("Not possible to find " + num + " th salary group" );
        }

    }

    public static Map.Entry<Integer, List<String>> getNthHighestSalary(int num, Map<String, Integer> map) {

        Map.Entry<Integer, List<String>> integerListEntry = map.entrySet()
                .stream()
                .collect(
                        Collectors.groupingBy(
                                entryMap -> entryMap.getValue(),
                                Collectors.mapping(entryMap -> entryMap.getKey(), Collectors.toList())

                        )
                )
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .toList()
                .get(num - 1);


        return integerListEntry;
    }

    public static Optional<Map.Entry<Integer, List<String>>>  getNthHighestSalary2(int num, Map<String, Integer> map) {

        return map.entrySet()
                .stream()
                .collect(
                        Collectors.groupingBy(
                                Map.Entry::getValue,
                                Collectors.mapping(Map.Entry::getKey, Collectors.toList())
                        )
                )
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .skip(num - 1L)
                .findFirst();
    }
}

