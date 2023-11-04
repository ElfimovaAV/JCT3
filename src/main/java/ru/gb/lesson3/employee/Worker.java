package ru.gb.lesson3.employee;

import ru.gb.lesson3.employee.Employee;

public class Worker extends Employee {

    public Worker(String firstName, String surName, int age, double salary) {
        super(firstName, surName, age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s: Рабочий; Возраст: %d; Заработная плата за месяц: %.2f",
                surName, firstName, age, calculateSalary());
    }
}
