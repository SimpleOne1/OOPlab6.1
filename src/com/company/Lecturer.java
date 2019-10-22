package com.company;

public class Lecturer extends AbstractPerson {
    private String department;
    private int Salary;

    public Lecturer(String surname, String name, String age, String Department, int Salary) {
        super(surname, name, age);
        this.department = Department;
        this.Salary = Salary;
    }

    @Override
    public String printInfo() {
        return "Преподователь кафедры " + department + " " + Surname + " " + Name + "Возраст: " + Age + ".Зарплата: " + Salary;
    }
}
