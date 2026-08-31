package com.javed.sort;

import com.javed.helper.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortEmployeeBySalary {

    public static void main(String[] args) {

        Employee e1 = new Employee(1, "abc", "it", 25000);
        Employee e2 = new Employee(2, "def", "it", 21000);
        Employee e3 = new Employee(1, "ghi", "cloud", 30000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        List<Employee> list = employeeList.stream().sorted(
                Comparator.comparingDouble(employee -> employee.getSalary())
        ).toList();

        System.out.println(list);
    }
}
