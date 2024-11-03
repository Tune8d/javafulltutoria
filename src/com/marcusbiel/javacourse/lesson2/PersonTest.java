package com.marcusbiel.javacourse.lesson2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    public void shouldReturnHelloWord(){

        Person marcus = new Person();
        assertEquals("Hello World",marcus.helloWorld());

    }

    @Test
    public void shouldReturnMarcus(){
        Person person1 = new Person();
        assertEquals("Hello Marcus", person1.hello("Marcus"));
    }

    @Test
    public void shouldReturnNumberofPersons(){
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();

        assertEquals(4, Person.numberOfPersons());
    }

    @Test
    public void shouldReturnNumberofPersonsLoop(){
        Person person1;

        int i = 0;

        do{
            person1 = new Person();
            i++;
        }while(i < 4);
        assertEquals(4, Person.numberOfPersons());

        //while(i < 4){
        //    person1 = new Person();
        //    i++;
        //}
        //assertEquals(4, Person.numberOfPersons());

    }

    @Test

    // https://youtu.be/grEKMHGYyns?si=rf1HakPHhGnItnyl&t=7214
    public void demonstrateArrays(){
        Person[] persons = new Person[4];
        int[] myInts = new int[4];
        Integer[] myInteger = new Integer[4];

        for(int i = 0; i < 4; i++){
            myInts[i] = i;
            myInteger[i] = i;

        }

        if(myInts[0] == myInteger[0]){
            System.out.println("Same?");
        }else{
            System.out.println("Different?");
        }




    }

    @Test
    public void demonstrateBoolean() {

        int i = 4;
        int j = 3;
        boolean areEqual = i == j; // != <> //

        if(i > j){
            j = 99;
        }else if(j > i){

        }else if(areEqual){
            i = 8;
        }else{
            j++;
        }
    }
}
