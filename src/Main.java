import CourseWork.Employee;

import java.util.Arrays;

public class Main {

    public static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        System.out.println(" Курсовая работа. Введение в профессию и синтаксис языка.");
        System.out.println();
        Employee employee1 = new Employee("Name1", "Surname1", "Midddlename1", 1, 190000);
        Employee employee2 = new Employee("Name2", "Surname2", "Midddlename2", 1, 115000);
        Employee employee3 = new Employee("Name3", "Surname3", "Midddlename3", 2, 80000);
        Employee employee4 = new Employee("Name4", "Surname4", "Midddlename4", 2, 123000);
        Employee employee5 = new Employee("Name5", "Surname5", "Midddlename5", 3, 155000);
        Employee employee6 = new Employee("Name6", "Surname6", "Midddlename6", 3, 112000);
        Employee employee7 = new Employee("Name7", "Surname7", "Midddlename7", 4, 90000);
        Employee employee8 = new Employee("Name8", "Surname8", "Midddlename8", 4, 156000);
        Employee employee9 = new Employee("Name9", "Surname9", "Midddlename9", 5, 110000);
        Employee employee10 = new Employee("Name10", "Surname10", "Midddlename10", 5, 99000);

        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        employees[4] = employee5;
        employees[5] = employee6;
        employees[6] = employee7;
        employees[7] = employee8;
        employees[8] = employee9;
        employees[9] = employee10;

        Arrays.stream(employees).forEach(System.out::println);
        System.out.println(employees.length);
    }

    public static void allEmployees() {
        for (Employee employee : employees) {
            System.out.println(employees);
        }
    }

    public static int allSalaryes() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee employeesMinimalSalary() {
        Employee result = employees[0];
        int minimalSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minimalSalary) {
                minimalSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee employeesMaximalSalary() {
        Employee result = employees[0];
        int maximalSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maximalSalary) {
                maximalSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static float averageSalary() {
        int cout = 0;
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                cout++;
                sum += employee.getSalary();
            }
        }
        return (float) sum / cout;
    }

    public static void fullEmployeeName() {
        for (Employee employee : employees) {
            System.out.println(employee.getSurName());
        }
    }
}

