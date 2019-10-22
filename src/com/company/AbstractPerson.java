package com.company;

public abstract class AbstractPerson {
    protected String Surname;
    protected String Name;
    protected String Age;
    public AbstractPerson(String surname, String name, String age) {
        Surname = surname;
        Name = name;
        Age = age;
    }
    public abstract String printInfo();
}
