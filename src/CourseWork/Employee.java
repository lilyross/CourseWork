package CourseWork;

public class Employee {
    private static int counter = 0;
    private Integer id;
    private String name;
    private String surName;
    private String middleName;
    private int department;
    private int salary;

    public Employee(String name, String surName, String middleName, int department, int salary) {
        this.name = name;
        this.surName = surName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public Integer getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "Id: " + id + '\'' +
                "Имя: " + name + '\'' +
                ", Фамилия: " + surName + '\'' +
                ", Отчетсво: " + middleName + '\'' +
                ", Отдел: " + department +
                ", Зарплата: " + salary +
                "}";
    }
}

