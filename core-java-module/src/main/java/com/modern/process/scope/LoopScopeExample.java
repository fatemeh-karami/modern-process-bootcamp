package com.modern.process.scope;

import java.util.Arrays;
import java.util.List;

public class LoopScopeExample {
    List<String> listOfNames = Arrays.asList("Joe" , "Susan" , "Pattrick");

    public void iterationOfNames(){
        String allName ="";
        for (String name : listOfNames){
            allName = allName + " " + name;
        }
        //compiler error , name cannot be resolved to a variable
       // String lastNameUsed = name;
    }

}
