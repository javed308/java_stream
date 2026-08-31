package com.javed.sort;

import com.javed.helper.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopThreeSalaries {

    public static void main(String[] args) {

        Employee e1 = new Employee(1, "abc", "it", 25000);
        Employee e2 = new Employee(2, "def", "it", 21000);
        Employee e3 = new Employee(3, "ghi", "cloud", 30000);
        Employee e4 = new Employee(4, "ghi", "cloud", 35000);
        Employee e5 = new Employee(5, "kef", "it", 15000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

        List<Employee> list = employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(3)
                .toList();

        System.out.println(list);


        /*
        top salary per dept
         */

        Map<String, List<Double>> collect = employeeList.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getDept,
                                Collectors.collectingAndThen(
                                        Collectors.toList(),
                                        employees -> employees.stream()
                                                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                                                .limit(2)
                                                .map(Employee::getSalary)
                                                .toList()
                                )
                        )
                );

        System.out.println(collect);
    }
}
