package ru.geekbrains.JDK_S04;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class EmployeesList<T extends Employee> {
    private List<T> employees;

    public EmployeesList(List<T> employees) {
        this.employees = employees;
    }

    public EmployeesList() {
        employees = new ArrayList<>();
    }

    public boolean add(T t) {
        return employees.add(t);
    }

    public int[] findNumbersByName(String nameEmployee) {
        return employees.stream()
                .filter(x -> x.getName().equals(nameEmployee))
                .mapToInt(Employee::getPhoneNumber)
                .toArray();
    }

    public T findByUUID(UUID uuid) {
        T employee = employees.stream()
                .filter(x -> x.getID().equals(uuid))
                .findAny().orElse(null);
        if (employee == null) {
            throw new IllegalArgumentException();
        }
        return employee;
    }

    public List<T> findByExp(int exp) {
        return employees.stream()
                .filter(x -> x.getExperience() > exp)
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "EmployeesList{" +
                "employees=" + employees +
                '}';
    }
}