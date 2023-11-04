package ru.gb.lesson3;

import ru.gb.lesson3.comparator.AgeComparator;
import ru.gb.lesson3.comparator.AscendingSalaryComparator;
import ru.gb.lesson3.comparator.DescendingSalaryComparator;
import ru.gb.lesson3.comparator.SurNameComparator;
import ru.gb.lesson3.employee.Employee;
import ru.gb.lesson3.employee.Freelancer;
import ru.gb.lesson3.employee.Worker;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new Worker("Kirill", "Ivanov", 40, 50000);
        employees[1] = new Freelancer("Boris", "Petrov", 40, 300, 22, 8);
        employees[2] = new Worker("Anton", "Kozlov", 20, 40000);
        employees[3] = new Freelancer("Vanessa", "Haritonova", 30, 250, 21, 8);

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Arrays.sort(employees, new DescendingSalaryComparator());

        System.out.println("\n*** Отсортированный по убыванию месячной заработной платы список сотрудников ***\n");

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Arrays.sort(employees, new AscendingSalaryComparator());

        System.out.println("\n*** Отсортированный по возрастанию месячной заработной платы список сотрудников ***\n");

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Arrays.sort(employees, new SurNameComparator());

        System.out.println("\n*** Отсортированный по фамилиям в алфавитном порядке список сотрудников ***\n");

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Arrays.sort(employees, new AgeComparator());

        System.out.println("\n*** Отсортированный по увеличению возраста список сотрудников ***\n");

        for (Employee employee : employees) {
            System.out.println(employee);
        }


    }
}
