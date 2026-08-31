package com.javed.grouping_by;

import com.javed.helper.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class HighestPaidEmployeeEachDept {

    public static void main(String[] args) {

        Employee e1 = new Employee(1, "abc", "it", 20000);
        Employee e2 = new Employee(2, "def", "it", 20000);
        Employee e3 = new Employee(1, "ghi", "cloud", 30000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        Map<String, Optional<Employee>> collect = employeeList.stream()
                .collect(
                        Collectors.groupingBy(
                                employee -> employee.getDept(),
                                Collectors.maxBy(Comparator.comparing(employee -> employee.getSalary()))
                        )
                );

        Map<String, Employee> collect2 = employeeList.stream()
                .collect(
                        Collectors.groupingBy(
                                employee -> employee.getDept(),
                                Collectors.collectingAndThen(
                                        Collectors.maxBy(
                                                Comparator.comparing(
                                                        employee -> employee.getSalary()
                                                )
                                        ),
                                        employee -> employee.get()
                                )

                        )
                );



        System.out.println(collect);
        System.out.println(collect2);
    }
}
