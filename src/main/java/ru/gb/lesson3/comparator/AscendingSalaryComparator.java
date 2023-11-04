package ru.gb.lesson3.comparator;

import ru.gb.lesson3.employee.Employee;

import java.util.Comparator;

public class AscendingSalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {

        return Double.compare(o1.calculateSalary(), o2.calculateSalary());
    }
}