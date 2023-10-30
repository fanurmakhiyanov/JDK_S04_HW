package ru.geekbrains.JDK_S04;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        EmployeesList<Employee> employeesList = new EmployeesList<>(new Stack<>());
        employeesList.add(new Employee(1234567,"Fanur",3));
        employeesList.add(new Employee(9876543,"Kirill",23));
        System.out.println(employeesList);

        int[] numbers = employeesList.findNumbersByName("Kirill");
        System.out.println(Arrays.toString(numbers));

        Employee employee = employeesList.findByExp(20).get(0);

        System.out.println(employeesList.findByExp(2));

        System.out.println(employeesList.findByUUID(employee.getID()));
    }
}