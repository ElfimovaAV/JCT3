package ru.gb.lesson3.employee;

public abstract class Employee implements Comparable<Employee>{

    protected String firstName;
    protected String surName;
    protected double salary;  //это ставка (часовая у фрилансера или месячная у основного работника)
    protected int age;

    public Employee(String firstName, String surName, int age, double salary) {
        this.firstName = firstName;
        this.surName = surName;
        this.age = age;
        this.salary = salary;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return String.format("Сотрудник: %s %s; Возраст: %d лет; Заработная плата за месяц: %.2f",
                surName, firstName, age, calculateSalary());
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(calculateSalary(), o.calculateSalary());
    }
}


