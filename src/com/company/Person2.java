package com.company;

public class Person2 implements InterfaceForPerson {
    protected String Surname;
   protected String Name;
    protected String Age;
    public Person2(String surname, String name, String age) {
        Surname = surname;
        Name = name;
        Age = age;
    }

    @Override
    public String printInfo() {
        return "Человек " + Surname+ " " + Name + ",Возраст :" + Age;
    }
}
