package com.javed.sort;

import com.javed.helper.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortEmpByMultipleFields {

    public static void main(String[] args) {

        Employee e1 = new Employee(1, "abc", "it", 25000);
        Employee e2 = new Employee(2, "def", "it", 21000);
        Employee e3 = new Employee(1, "ghi", "cloud", 30000);
        Employee e4 = new Employee(1, "ghi", "cloud", 35000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);

        List<Employee> list = employeeList.stream()
                .sorted(
                        Comparator.comparing(Employee::getDept).thenComparingDouble(Employee::getSalary)

                ).toList();

        System.out.println(list);
    }
}
