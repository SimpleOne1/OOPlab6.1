package com.company;

public class Student2 extends Person2  {
    private String Group;
    private int NumberOfTicket;

    public Student2(String surname, String name, String age, String Group,int NumberOfTicket) {
        super(surname, name, age);
        this.Group=Group;
        this.NumberOfTicket=NumberOfTicket;
    }

    @Override
    public String printInfo() {
        return "Студент группа "+Group+" "+Surname+" "+Name+",возраст : "+Age +".Номер студенческого билета "+ NumberOfTicket;
    }
}
