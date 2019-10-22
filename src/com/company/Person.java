package com.company;

public class Person extends AbstractPerson {
    public Person(String surname, String name, String age) {
        super(surname, name, age);
    }
    public void setSurname(String surname) {
        Surname = surname;
    }
    @Override
    public String printInfo(){
        return "Человек " + Surname+ " " + Name + ",Возраст :" + Age;
    }
}
