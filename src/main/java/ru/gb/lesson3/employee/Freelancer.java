package ru.gb.lesson3.employee;

import ru.gb.lesson3.employee.Employee;

public class Freelancer extends Employee {
    protected int countDays;
    protected int countHours;

    public Freelancer(String firstName, String surName, int age, double salary, int countDays, int countHours) {
        super(firstName, surName, age, salary);
        this.countDays = countDays;
        this.countHours = countHours;
    }

    @Override
    public double calculateSalary() {
        return salary * countDays * countHours;
    }

    @Override
    public String toString() {
        return String.format("%s %s: Фрилансер; Возраст: %d; Заработная плата за месяц: %.2f",
                surName, firstName, age, calculateSalary());
    }
}