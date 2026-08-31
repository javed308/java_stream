package com.javed.grouping_by;

import com.javed.helper.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CalculateAvgSalaryPerDept {

    public static void main(String[] args) {

        Employee e1 = new Employee(1, "abc", "it", 25000);
        Employee e2 = new Employee(2, "def", "it", 21000);
        Employee e3 = new Employee(1, "ghi", "cloud", 30000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        Map<String, Double> collect =
                employeeList.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getDept,
                                Collectors.averagingDouble(Employee::getSalary)
                        )
                );

        System.out.println(collect);
    }
}
