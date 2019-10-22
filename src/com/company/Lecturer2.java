package com.company;

public class Lecturer2 extends Person2  {
    private String department;
    private int Salary;

    public Lecturer2(String surname, String name, String age,String Department,int Salary) {
        super(surname, name, age);
        this.department=Department;
        this.Salary=Salary;
    }

    @Override
    public String printInfo() {
        return "Преподователь кафедры " + department + " " + Surname + " " + Name + "Возраст: " + Age + ".Зарплата: " + Salary;
    }
}
