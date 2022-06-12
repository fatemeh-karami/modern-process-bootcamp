package com.modern.process.interfaces.multiInheritance;

public interface Transform {

    void transform();
    default void printSpaces(){
        System.out.println(" transform Spesification");
    }
}
