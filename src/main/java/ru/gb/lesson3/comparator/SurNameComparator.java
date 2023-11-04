package ru.gb.lesson3.comparator;

import ru.gb.lesson3.employee.Employee;

import java.util.Comparator;

public class SurNameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {

        return o1.getSurName().compareTo(o2.getSurName());
    }

}