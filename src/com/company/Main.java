package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1-ое задание
        Scanner in=new Scanner (System.in);
        AbstractPerson Kostya=new Person("Cheban","Kosyanus","18");
        AbstractPerson Max=new Student ("Batura","Max","20","ad181",6);
        AbstractPerson Vlad=new Student("Melnik","Vlad","18","ad181",14);
        AbstractPerson John=new Lecturer("Wick","John","3*","IT",200000);
        AbstractPerson Adam=new Lecturer("Jensen","Adam","3*","Cybernetics",100000);

        AbstractPerson[] listOfPerson=new AbstractPerson[]{Max,Vlad,John,Adam,Kostya};
        for(AbstractPerson vallue:listOfPerson){
            System.out.println(vallue.printInfo());
        }
        System.out.println();
        //
        //
        //
        //2-ое задание
        InterfaceForPerson Kostyanus=new Person2("Cheban","Kosyanus","18");
        InterfaceForPerson Mak=new Student2 ("Batura","Max","20","ad181",6);
        InterfaceForPerson Vlak=new Student2("Melnik","Vlad","18","ad181",14);
        InterfaceForPerson wfwfwf=new Lecturer2("Wick","John","3*","IT",200000);
        InterfaceForPerson Zlodiy=new Lecturer2("Jensen","Adam","3*","Cybernetics",100000);

       InterfaceForPerson[] listOfPerson2=new InterfaceForPerson[]{Kostyanus,Mak,Vlak,wfwfwf,Zlodiy};
        for(InterfaceForPerson vallue:listOfPerson2){
            System.out.println(vallue.printInfo());
        }
    }
}
