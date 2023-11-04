package ru.gb.lesson3.comparator;

import ru.gb.lesson3.employee.Employee;

import java.util.Comparator;

public class DescendingSalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {

        return Double.compare(o2.calculateSalary(), o1.calculateSalary());
    }
}