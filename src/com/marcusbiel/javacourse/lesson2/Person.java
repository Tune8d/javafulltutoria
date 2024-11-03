package com.marcusbiel.javacourse.lesson2;

import com.marcusbiel.javacourse.lesson3.Name;

public class Person {

    private Name personName;
    private static int personCounter;

    public Person() {
        personCounter++;
        /*
           empty on purpose
        */
    }

    public String helloWorld() {
        return "Hello World";
    }

    public Name name(){
        return personName;
    }

    public String hello(String name) {
        helloWorld();
        return "Hello " + name;
    }

    public static int numberOfPersons() {
        return personCounter;
    }
}
