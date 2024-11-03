package com.marcusbiel.javacourse.lesson2;

import com.marcusbiel.javacourse.lesson10.LoggingLevel;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    static final String[] MY_STATE_VALUES = {"PENDING", "PROCESSING", "PROCESSED"};

    private static final int PENDING = 40;
    private static final int PROCESSING = 41;
    private static final int PROCESSED = 42;

    private static final String SOMETHING = "42";


    public String[] states(){
        return Arrays.copyOf(MY_STATE_VALUES, MY_STATE_VALUES.length);
    }

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

    // https://youtu.be/grEKMHGYyns?si=rf1HakPHhGnItnyl&t=7214
    @Test
    public void demonstrateArrays(){
        Person[] persons = new Person[4];
        for(int i = 0; i < 4; i++){
            persons[i] = new Person();
        }

        for(Person person : persons){
            person.helloWorld();
        }

        Person myPerson = new Person();
        Person myPerson2 = null;
        // final makes a variable immutable
        Person[] persons2 = {persons[0], null, myPerson, myPerson2, persons[2], persons[3], persons[4]};



        // this works... // int i = 3; 3 = i;
        // But for objects, you should use .equals() for comparison
        "ABC".equals("ACB"); // Always refer to the object directly for comparison


        LoggingLevel state = LoggingLevel.PROCESSING;

        int myState = PENDING;
        myState = 300;

        String myString = "myString";

        // unify datatypes when applying switch & case values
        switch(myString){
            case SOMETHING:
                /*
                * falls through
                * */
            //case PROCESSED:
                //callAMethod();
                break;
            default:
        }


        // Enum is a constrained series of values, as the final keyword limits the variables.

        for(LoggingLevel states : LoggingLevel.values()){
            if(state == LoggingLevel.PENDING){
                //callAMethod();
            }
            if(state == LoggingLevel.PROCESSED){
                //callAMethod();
            }
            if(state == LoggingLevel.PROCESSING){
                //callAMethod();
            }
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
