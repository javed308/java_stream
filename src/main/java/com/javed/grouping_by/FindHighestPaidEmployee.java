package com.javed.grouping_by;

import com.javed.helper.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindHighestPaidEmployee {

    public static void main(String[] args) {

        Employee e1 = new Employee(1, "abc", "it", 20000);
        Employee e2 = new Employee(2, "def", "it", 20000);
        Employee e3 = new Employee(1, "ghi", "cloud", 30000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        Optional<Employee> first = employeeList.stream()

                .max(Comparator.comparing(employee -> employee.getSalary()));

        System.out.println(first.get());
    }
}
